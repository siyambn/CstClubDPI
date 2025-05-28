package com.example.cstclub_dpi11
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class WelcomeActivity : AppCompatActivity() {

    private lateinit var cyclingTextView: TextView
    private val techWords = listOf(
        "Doers", "Changemakers", "Trailblazers", "Achievers", "Visionaries",
        "Problem Solvers", "Builders", "Thinkers", "Creators", "Leaders",
        "Innovators", "Digital Warriors", "Tech Heroes", "Future Engineers",
        "Game Changers", "Disruptors"
    )
    private var job: Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        supportActionBar?.hide()

        cyclingTextView = findViewById(R.id.cyclingTextView)
        val continueButton: Button = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        startTextAnimation()
    }

    private fun startTextAnimation() {
        val scope = CoroutineScope(Dispatchers.Main + SupervisorJob())

        job = scope.launch {
            var index = 0
            while (isActive) {
                val word = techWords[index]

                cyclingTextView.animate().alpha(0f).setDuration(500).withEndAction {
                    cyclingTextView.text = word
                    cyclingTextView.animate().alpha(1f).setDuration(500).start()
                }.start()

                index = (index + 1) % techWords.size
                delay(2000)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job?.cancel()
    }
}