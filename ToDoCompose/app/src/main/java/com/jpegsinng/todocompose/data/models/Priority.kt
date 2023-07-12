package com.jpegsinng.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.jpegsinng.todocompose.ui.theme.HighPriorityColor
import com.jpegsinng.todocompose.ui.theme.LowPriorityColor
import com.jpegsinng.todocompose.ui.theme.MediumPriorityColor
import com.jpegsinng.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}