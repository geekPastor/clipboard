package com.geekpastor.clipboard.ui.components.homescren

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.geekpastor.clipboard.ui.theme.ClipboardTheme
import com.geekpastor.clipboard.util.MultiPreview

@Composable
fun AddDialog(
    onDismissRequest : ()->Unit
){
    Dialog(
        onDismissRequest = onDismissRequest
    ) {
        var text by remember {
            mutableStateOf("")
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.background)
                .padding(20.dp)
        ) {
            TextField(
                value = text,
                onValueChange = {text = it},
                singleLine = false
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                IconButtonWithText(onClick = {}, Icons.Default.Done, text = "Update")
                IconButtonWithText(onClick = {}, Icons.Default.Done, text = "Copy")
                IconButtonWithText(onClick = {}, Icons.Outlined.Delete, text = "Delete")
            }
        }
    }
}


@MultiPreview
@Composable
private fun AddDialogPreview(){
    ClipboardTheme {
        AddDialog(onDismissRequest = {})
    }
}