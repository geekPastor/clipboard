package com.geekpastor.clipboard.ui.components.homescren


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.geekpastor.clipboard.ui.theme.ClipboardTheme
import com.geekpastor.clipboard.util.MultiPreview
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    showSearchBar: Boolean
) {

    var textQuery by remember {
        mutableStateOf("")
    }
    var activeState by remember {
        mutableStateOf(false)
    }

    var searchBarState = showSearchBar

    val items = remember {
        mutableStateListOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmo",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmo",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmo",
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(
            modifier = Modifier
                .size(50.dp),
            shape = CircleShape,
            color = Color.White.copy(alpha = 0.4f)
        ) {
            IconButton(onClick = { searchBarState = false }) {
                Icon(
                    modifier = Modifier.size(80.dp),
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = null
                )
            }
        }
        SearchBar(
            modifier = Modifier.fillMaxWidth(),
            query = textQuery,
            onQueryChange = {textQuery = it},
            onSearch = {
                items.add(textQuery)
                activeState = false
            },
            active = activeState,
            onActiveChange = { activeState = it },
            placeholder = {
                Text(text = "Search")
            },
            trailingIcon = {
                if (activeState){
                    Icon(
                        modifier = Modifier
                            .clickable {
                                if(textQuery.isNotEmpty()){
                                    textQuery = ""
                                } else{
                                    activeState = false
                                }
                            },
                        imageVector = Icons.Default.Close,
                        contentDescription = null
                    )
                }
            }
        ) {
            items.forEach{
                CardComponent(
                    text = it,
                    image = null
                )
            }
        }
    }
}



@MultiPreview
@Composable
fun SearchBarPreview(){
    ClipboardTheme {
        SearchBar(showSearchBar = false)
    }
}