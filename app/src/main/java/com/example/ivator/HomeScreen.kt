package com.example.ivator

import android.app.TimePickerDialog
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Calendar
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.i18n.DateTimeFormatter
import androidx.lifecycle.ViewModel
import com.example.ivator.ui.theme.dongleFontFamily
import com.example.ivator.ui.theme.urbanistFontFamily
import com.example.ivator.ui.theme.white
import java.time.LocalDateTime
import java.util.Calendar



@RequiresApi(64)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    val alarms = remember { mutableStateOf(listOf<Alarm>()) }
    val showDialog = remember { mutableStateOf(false) }
    val newAlarmTime = remember { mutableStateOf("") }
    val newAlarmReason = remember { mutableStateOf(TextFieldValue("")) }
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                contentAlignment = Alignment.TopStart
            ) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(id = R.drawable.group1),
                    contentDescription = null
                )

                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "IVATOR",
                        fontSize = 60.sp,
                        color = white,
                        fontFamily = dongleFontFamily,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 20.dp, end = 0.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))



                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_account_circle_24),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(10.dp)
                                .size(60.dp)
                                .clip(CircleShape)
                        )
                        Column {
                            Text(
                                text = "name",
                                fontSize = 25.sp,
                                color = white,
                                fontFamily = urbanistFontFamily, fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 2.dp)
                            )
                            Text(
                                text = "age | gender | liquid",
                                fontSize = 15.sp,
                                fontFamily = urbanistFontFamily, fontWeight = FontWeight(400),
                                modifier = Modifier.padding(top = 1.dp)
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .background(color = Color(0xFFE0E0E0))
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Drop Rate",
                        fontSize = 25.sp,
                        fontFamily = urbanistFontFamily,
                        fontWeight = FontWeight(900),
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = "30",
                        fontFamily = urbanistFontFamily,
                        fontSize = 40.sp,
                        fontWeight = FontWeight(800),
                        modifier = Modifier.padding(5.dp)
                    )

                    Text(
                        text = "ml/sec",
                        fontFamily = urbanistFontFamily,
                        fontSize = 25.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(5.dp)
                    )

                    Text(
                        text = "set rate : 20",
                        fontFamily = urbanistFontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(top = 0.dp, bottom = 5.dp)
                    )

                    Text(
                        text = "change",
                        fontFamily = urbanistFontFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(800),
                        modifier = Modifier.padding(5.dp)
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .background(color = Color(0xFFE0E0E0))
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Flow Rate",
                        fontSize = 25.sp,
                        fontFamily = urbanistFontFamily,
                        fontWeight = FontWeight(900),
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = "30",
                        fontFamily = urbanistFontFamily,
                        fontSize = 40.sp,
                        fontWeight = FontWeight(800),
                        modifier = Modifier.padding(5.dp)
                    )

                    Text(
                        text = "ml/sec",
                        fontFamily = urbanistFontFamily,
                        fontSize = 25.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(5.dp)
                    )

                    Text(
                        text = "set rate : 20",
                        fontFamily = urbanistFontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400),
                        modifier = Modifier.padding(top = 0.dp, bottom = 5.dp)
                    )

                    Text(
                        text = "change",
                        fontFamily = urbanistFontFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(800),
                        modifier = Modifier.padding(5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 25.dp)
                    .background(color = Color(0xFFE0E0E0))
                    .padding(horizontal = 16.dp)
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    horizontalAlignment = Alignment.Start,
                ) {
                    Text(
                        text = "Liquometer",
                        fontSize = 25.sp,
                        fontFamily = urbanistFontFamily,
                        fontWeight = FontWeight(900),
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Current Status",
                            fontFamily = urbanistFontFamily,
                            fontSize = 20.sp,
                            fontWeight = FontWeight(400),
                        )
                        Text(text = "450 / 500ml",
                            fontFamily = urbanistFontFamily,
                            fontSize = 25.sp,
                            fontWeight = FontWeight(800),
                            modifier = Modifier.padding(5.dp))
                    }
                }

            }
            Spacer(modifier = Modifier.height(20.dp))

            // AlarmRow
            AlarmRow(
                alarms = alarms.value,
                onAddAlarm = { showDialog.value = true }
            )
        }
    }

    if (showDialog.value) {
        AddAlarmDialog(
            onDismiss = { showDialog.value = false },
            onAddAlarm = { time, reason ->
                alarms.value = alarms.value + Alarm(time, reason)
                showDialog.value = false
            },
            newAlarmTime = newAlarmTime,
            newAlarmReason = newAlarmReason
        )
    }
}
@Composable
fun AlarmRow(
    alarms: List<Alarm>,
    onAddAlarm: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(alarms) { alarm ->
            AlarmCard(alarm)
        }
        item {
            AddAlarmButton(onAddAlarm)
        }
    }
}

@Composable
fun AlarmCard(alarm: Alarm) {
    Box(
        modifier = Modifier
            .size(120.dp, 80.dp)
            .background(Color.LightGray)
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(alarm.time)
            Text(alarm.reason)
        }
    }
}

@Composable
fun AddAlarmButton(onAddAlarm: () -> Unit) {
    Box(
        modifier = Modifier
            .size(120.dp, 80.dp)
            .background(Color.Green)
            .clickable { onAddAlarm() }
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Add Alarm",
            color = Color.White
        )
    }
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
@Composable
fun AddAlarmDialog(
    onDismiss: () -> Unit,
    onAddAlarm: (String, String) -> Unit,
    newAlarmTime: MutableState<String>,
    newAlarmReason: MutableState<TextFieldValue>
) {
    val context = LocalContext.current
    val localDateTime = remember { mutableStateOf(LocalDateTime.now()) }

    val timePickerDialog = TimePickerDialog(
        context,
        { _, hourOfDay: Int, minute: Int ->
            localDateTime.value = localDateTime.value.withHour(hourOfDay).withMinute(minute)
            newAlarmTime.value = localDateTime.value.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm"))
        },
        localDateTime.value.hour,
        localDateTime.value.minute,
        true
    )

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(text = "Add Alarm") },
        text = {
            Column {
                OutlinedButton(onClick = { timePickerDialog.show() }) {
                    Text(text = if (newAlarmTime.value.isEmpty()) "Pick Time" else newAlarmTime.value)
                }
                OutlinedTextField(
                    value = newAlarmReason.value,
                    onValueChange = { newAlarmReason.value = it },
                    label = { Text("Reason") }
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    if (newAlarmTime.value.isNotEmpty() && newAlarmReason.value.text.isNotEmpty()) {
                        onAddAlarm(newAlarmTime.value, newAlarmReason.value.text)
                    }
                }
            ) {
                Text("Add")
            }
        },
        dismissButton = {
            OutlinedButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}


data class Alarm(val time: String, val reason: String)

class AlarmViewModel : ViewModel() {
    private val _alarms = mutableStateOf<List<Alarm>>(emptyList())
    val alarms: State<List<Alarm>> = _alarms

    private val _isDialogVisible = mutableStateOf(false)
    val isDialogVisible: Boolean get() = _isDialogVisible.value

    fun addAlarm(time: String, reason: String) {
        _alarms.value = _alarms.value + Alarm(time, reason)
    }

    fun showAlarmDialog() {
        _isDialogVisible.value = true
    }

    fun hideAlarmDialog() {
        _isDialogVisible.value = false
    }
}