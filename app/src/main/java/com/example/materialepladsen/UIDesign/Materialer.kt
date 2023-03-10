package com.example.materialepladsen.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.materialepladsen.R
import com.example.materialepladsen.Data.Granitskærver
import com.example.materialepladsen.Data.Genbrugsmaterialer
import com.example.materialepladsen.Data.GrusOgSand
import com.example.materialepladsen.Data.JordOgMuld
import com.example.materialepladsen.Data.Sten
import com.example.materialepladsen.Data.TræflisOgBark


@Composable
fun Materialer(){
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()

    ){
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(Granitskærver) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(GrusOgSand) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(JordOgMuld) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(Sten) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(TræflisOgBark) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
        item {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            )
            {
                items(Genbrugsmaterialer) { Material ->
                    Box(
                    ) {
                        AsyncImage(
                            modifier = Modifier
                                .padding(10.dp)
                                .align(Alignment.Center)
                                .border(2.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(5)),
                            model = Material.picture,
                            contentDescription = null,
                            placeholder = painterResource(id = R.drawable.loadingimage)
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .offset(x = 10.dp, y = (-10).dp)
                                .background(color = Color.Transparent)
                                .border(5.dp, Color.Transparent, RoundedCornerShape(10))
                                .clip(RoundedCornerShape(10))

                        ) {
                            Text(text = " "+ Material.materialName + " ",
                                fontSize = 40.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopStart)
                                    .padding(bottom = 10.dp)
                                    .background(color = DarkRed, shape = RoundedCornerShape(10))
                                    .shadow(elevation = 1.dp))
                        }

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = 60.dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.productSize, fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(bottom = 10.dp))
                        }
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(color = Color.Transparent)
                                .offset(x = (-60).dp, y = (25).dp)
                                .align(Alignment.BottomCenter)
                        ) {
                            Text(text = Material.materialPrice.toString() +" "+"Kr.Pr.KG", fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 5.dp)
        }
    }
 }
@Preview(showBackground = true)
@Composable
fun ComposablePreview3() {
    Materialer()
}



