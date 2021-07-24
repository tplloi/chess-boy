package com.nwagu.chessboy.util

import android.content.Context
import android.content.ContextWrapper
import com.nwagu.chessboy.screens.main.MainActivity

object Utils {

    fun unwrap(context: Context): MainActivity {
        var _context: Context = context
        while (_context !is MainActivity && _context is ContextWrapper) {
            _context = _context.baseContext
        }
        return _context as MainActivity
    }
}