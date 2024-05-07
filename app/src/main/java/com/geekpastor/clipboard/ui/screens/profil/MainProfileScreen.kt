package com.geekpastor.clipboard.ui.screens.profil

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.geekpastor.clipboard.ui.theme.ClipboardTheme
import com.geekpastor.clipboard.util.MultiPreview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainProfileScreen(modifier: Modifier=Modifier){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = null
                            )
                        }
                        Text(text = "Your account")
                    }
                })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedCard(
                modifier = modifier
                    .padding(end = 20.dp, start = 20.dp, top= 20.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp)
                ) {
                    Text(
                        text = "Connected Devices",
                        style = MaterialTheme.typography.bodyLarge
                    )

                    Column(
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                modifier = Modifier.size(25.dp),
                                tint = MaterialTheme.colorScheme.tertiary
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(text = "Google Chrome")
                                Text(text = "Vendredi 29/Juin/2024")
                            }
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                modifier = Modifier.size(25.dp),
                                tint = MaterialTheme.colorScheme.tertiary
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(text = "Google Chrome")
                                Text(text = "Vendredi 29/Juin/2024")
                            }
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = null,
                                modifier = Modifier.size(25.dp),
                                tint = MaterialTheme.colorScheme.tertiary
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(text = "Google Chrome")
                                Text(text = "Vendredi 29/Juin/2024")
                            }
                        }
                    }
                }
            }

            OutlinedCard(
                modifier = modifier
                    .padding(end = 20.dp, start = 20.dp, top= 20.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp)
                ) {
                    Text(
                        text = "Connected Devices",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            OutlinedCard(
                modifier = modifier
                    .padding(end = 20.dp, start = 20.dp, top= 20.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp)
                ) {
                    Text(
                        text = "Connected Devices",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            OutlinedCard(
                modifier = modifier
                    .padding(end = 20.dp, start = 20.dp, top= 20.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(25.dp)
                ) {
                    Text(
                        text = "Connected Devices",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }

    }
}

@MultiPreview
@Composable
fun MainProfileScreenPreview(){
    ClipboardTheme {
        MainProfileScreen()
    }
}