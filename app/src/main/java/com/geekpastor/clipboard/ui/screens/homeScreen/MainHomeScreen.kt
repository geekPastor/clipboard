package com.geekpastor.clipboard.ui.screens.homeScreen



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.geekpastor.clipboard.R
import com.geekpastor.clipboard.ui.components.homescren.AddDialog
import com.geekpastor.clipboard.ui.components.homescren.CardComponent
import com.geekpastor.clipboard.ui.components.homescren.SearchBar
import com.geekpastor.clipboard.ui.theme.ClipboardTheme
import com.geekpastor.clipboard.util.MultiPreview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHomeScreen(){
    var showAddDialog by remember {
        mutableStateOf(false)
    }

    var showSearchbar by remember {
        mutableStateOf(false)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Clipboard") },
                actions = {
                    Surface(
                        modifier = Modifier
                            .padding(top = 15.dp, end = 20.dp)
                            .size(40.dp),
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.4f)
                    ) {
                        IconButton(onClick = {
                            showSearchbar = true
                        }) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = null)
                        }
                    }

                    Surface(
                        modifier = Modifier
                            .padding(top = 15.dp, end = 20.dp)
                            .size(40.dp),
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.4f)
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {

                            Image(painter = painterResource(id = R.drawable.image), contentDescription = "")
                        }
                    }
                }
            )

            if(showSearchbar){
                SearchBar(showSearchBar = true)
            }
        },
        floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        showAddDialog = true
                    },
                    shape = CircleShape
                ) {
                    Icon(imageVector = Icons.Filled.Add, contentDescription = "")
                }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(10){
                CardComponent(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmo",
                    image = null
                )
                Spacer(modifier = Modifier.height(16.dp))
                CardComponent(
                    text = "Lorem ipsum dolor sit amet",
                    image = painterResource(id = R.drawable.image)
                )
            }
        }

        if(showAddDialog){
            AddDialog(
                onDismissRequest = {
                    showAddDialog = true
                }
            )
        }

    }
}

@MultiPreview
@Composable
fun MainHomeScreenPreview(){
    ClipboardTheme{
        MainHomeScreen()
    }
}