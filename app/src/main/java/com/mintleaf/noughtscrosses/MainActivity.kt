package com.mintleaf.noughtscrosses

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mintleaf.noughtscrosses.ui.theme.NoughtscrossesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)
        var buttonClicked = findViewById<Button>(R.id.button)
        buttonClicked.setOnClickListener {
            setContentView(R.layout.game_page)
            var turn = 0
            var title = findViewById<TextView>(R.id.title2)
            var results = Array(9) {""}
            var x1y1 = findViewById<Button>(R.id.x1y1)
            var x2y1 = findViewById<Button>(R.id.x2y1)
            var x3y1 = findViewById<Button>(R.id.x3y1)
            var x1y2 = findViewById<Button>(R.id.x1y2)
            var x2y2 = findViewById<Button>(R.id.x2y2)
            var x3y2 = findViewById<Button>(R.id.x3y2)
            var x1y3 = findViewById<Button>(R.id.x1y3)
            var x2y3 = findViewById<Button>(R.id.x2y3)
            var x3y3 = findViewById<Button>(R.id.x3y3)
            if (turn == 0) {
                title.text = "Noughts Turn!"
            }
            else {
                title.text = "Crosses Turn!"
            }
            x1y1.setOnClickListener {
                if (results[0] == "") {
                    if (turn == 0) {
                        results[0] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[0] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x1y1.text = results[0]
            }
            x2y1.setOnClickListener {
                if (results[1] == "") {
                    if (turn == 0) {
                        results[1] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[1] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x2y1.text = results[1]
            }
            x3y1.setOnClickListener {
                if (results[2] == "") {
                    if (turn == 0) {
                        results[2] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[2] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x3y1.text = results[2]
            }
            x1y2.setOnClickListener {
                if (results[3] == "") {
                    if (turn == 0) {
                        results[3] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[3] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x1y2.text = results[3]
            }
            x2y2.setOnClickListener {
                if (results[4] == "") {
                    if (turn == 0) {
                        results[4] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[4] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x2y2.text = results[4]
            }
            x3y2.setOnClickListener {
                if (results[5] == "") {
                    if (turn == 0) {
                        results[5] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[5] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x3y2.text = results[5]
            }
            x1y3.setOnClickListener {
                if (results[6] == "") {
                    if (turn == 0) {
                        results[6] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[6] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x1y3.text = results[6]
            }
            x2y3.setOnClickListener {
                if (results[7] == "") {
                    if (turn == 0) {
                        results[7] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[7] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x2y3.text = results[7]
            }
            x3y3.setOnClickListener {
                if (results[8] == "") {
                    if (turn == 0) {
                        results[8] = "O"
                        title.text = "Crosses Turn!"
                        turn = 1
                    }
                    else {
                        results[8] = "X"
                        title.text = "Noughts Turn!"
                        turn = 0
                    }
                }
                x3y3.text = results[8]
            }
        }
    }
}