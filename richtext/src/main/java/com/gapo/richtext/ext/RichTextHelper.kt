package com.gapo.richtext.ext

import android.widget.TextView

/**
 * @author vietth
 * @since 29/09/2021
 */
class RichTextHelper(
    private val textView: TextView
) {

    fun setOnClickNotSpanListener(onClick: () -> Unit) {
        textView.setOnClickListener {
            if (textView.selectionStart == -1 && textView.selectionEnd == -1) {
                onClick()
            }
        }
    }
}