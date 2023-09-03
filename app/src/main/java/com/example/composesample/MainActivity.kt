package com.example.composesample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ComposeSampleTheme
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeSampleTheme(false, {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//                    Greeting(Message("Rajeev", "Android Developer"))
//                }
//            } )
            ComposeSampleTheme {
                var enabled by remember { mutableStateOf(true) }

                val alpha: Float by animateFloatAsState(if (enabled) 1f else 0.5f)
                Box(
                    Modifier
                        .fillMaxSize()
                        .graphicsLayer(alpha = alpha)
                        .background(Color.Red)
                ) {
                    Button(
                        onClick = { enabled = enabled.not() },
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                    ) {
                        Text("click")
                    }
                }



                //Conversation(SampleData.conversationSample)
//                Canvas(modifier = Modifier.fillMaxSize()) {
//                    Log.d("Rajeev", "$size")
//                    val canvasQuadrantSize = size / 2F
//                    Log.d("Rajeev", "$canvasQuadrantSize")
//                    drawRect(
//                        color = Color.Magenta,
//                        size = canvasQuadrantSize
//                    )
//                }

//                Canvas(modifier = Modifier.fillMaxSize()) {
//                    translate(left = 100f, top = 500f) {
//                        drawCircle(Color.Blue, radius = 200.dp.toPx())
//                    }
//                }
//
//                var pointerOffset by remember {
//                    mutableStateOf(Offset(0f, 0f))
//                }
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .pointerInput("dragging") {
//                            detectDragGestures { change, dragAmount ->
//                                pointerOffset += dragAmount
//                            }
//                        }
//                        .onSizeChanged {
//                            pointerOffset = Offset(it.width / 2f, it.height / 2f)
//                        }
//                        .drawBehind {
//                            // draws a fully black area with a small keyhole at pointerOffset that’ll show part of the UI.
//                            drawRect(
//                                Brush.radialGradient(
//                                    listOf(Color.Transparent, Color.Black),
//                                    center = pointerOffset,
//                                    radius = 100.dp.toPx(),
//                                )
//                            )
//                            //drawContent()
//                        }
//                ) {
//                    // Your composables here
//                    Spacer(
//                        modifier = Modifier
//                            .drawWithCache {
//                                val path = Path()
//                                path.moveTo(0f, 0f)
//                                path.lineTo(size.width / 2f, size.height / 2f)
//                                path.lineTo(size.width, 0f)
//                                path.close()
//                                onDrawBehind {
//                                    drawPath(path, Color.Magenta, style = Stroke(width = 10f))
//                                }
//                            }
//                            .fillMaxSize()
//                    )
//                }
            }
        }
    }
}

@Composable
fun Greeting(message: Message) {
//    Row{
//        Image(
//            painter = painterResource(R.drawable.profile_picture),
//            contentDescription = "Contact profile picture",
//            modifier = Modifier
//                // Set image size to 40 dp
//                .size(40.dp)
//                // Clip image to be shaped as a circle
//                .clip(CircleShape)
//                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
//        )
//        // Add a horizontal space between the image and the column
//        Spacer(modifier = Modifier.width(8.dp))
//
//        // We keep track if the message is expanded or not in this
//        // variable
//        var isExpanded by remember { mutableStateOf(false) }
//
//        // surfaceColor will be updated gradually from one color to the other
//        val surfaceColor by animateColorAsState(
//            if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
//        )
//
////        val surfaceColor =
////            if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface
//
//        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }){
//            Text(
//                text = message.name,
//                color = MaterialTheme.colors.secondaryVariant,
//                style = MaterialTheme.typography.subtitle2
//            )
//
//            Spacer(modifier = Modifier.height(4.dp))
//
//            Surface(
//                shape = MaterialTheme.shapes.medium,
//                elevation = 1.dp,
//                // surfaceColor color will be changing gradually from primary to surface
//                color = surfaceColor,
//                // animateContentSize will change the Surface size gradually
//                modifier = Modifier
//                    .animateContentSize()
//                    .padding(1.dp)
//
//            ) {
//                Text(
//                    text = message.designation,
//                    modifier = Modifier.padding(all = 4.dp),
//                    // If the message is expanded, we display all its content
//                    // otherwise we only display the first line
//                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
//                    style = MaterialTheme.typography.body2
//                )
//            }
//        }
//    }


    ComposeSampleTheme {
        var enabled by remember { mutableStateOf(true) }

        val alpha: Float by animateFloatAsState(if (enabled) 1f else 0.5f)
        Box(
            Modifier
                .fillMaxSize()
                .graphicsLayer(alpha = alpha)
                .background(Color.Red)
        ) {
            Button(
                onClick = { enabled = enabled.not() },
                modifier = Modifier
                    .width(200.dp)
                    .height(100.dp)
            ) {
                Text("click")
            }
        }

    }
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
       items(messages){ message ->
           Greeting(message)
       }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    ComposeSampleTheme {
        Conversation(SampleData.conversationSample)
    }
}

@Composable
fun test() {

    Row {
        Row {

        }
    }

    Column {

    }

    Box {

    }
}
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeSampleTheme(false, {
//        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//            Greeting(Message("Rajeev", "Android Developer"))
//        }
//    })
//}

data class Message(val name: String, val designation: String)