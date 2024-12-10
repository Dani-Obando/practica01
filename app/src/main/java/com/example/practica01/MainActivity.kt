package com.example.practica01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        // Llamadas a las funciones de los problemas
        val resultados = """
            -----------------------------
            Problema 1:
            ${problema1()}
            -----------------------------
            Problema 2:
            ${problema2()}
            -----------------------------
            Problema 3:
            ${problema3(12, 8)}
            -----------------------------
            Problema 4:
            ${problema4(15, 15)}
            -----------------------------
            Problema 5:
            ${problema5(7, 3)}
            -----------------------------
            Problema 6:
            ${problema6(5, 3)}
            -----------------------------
            Problema 7:
            ${problema7(3.0, 4.0, 0.0, 0.0)}
            -----------------------------
            Problema 8:
            ${problema8("seiscientos treinta y uno")}
        """.trimIndent()

        // Mostrar los resultados en el TextView
        textView.text = resultados
    }

    // Problema 1
    private fun problema1(): String {
        val numeroPensado = ((7 * 4 + 5) / 3) - 9
        return """
            Fórmula original: ((x + 9) * 3 - 5) / 4 = 7
            Número resuelto: $numeroPensado
        """.trimIndent()
    }

    // Problema 2
    private fun problema2(): String {
        val grados = (9 - 2) * 30
        return """
            Fórmula: Grados rotados = (Hora final - Hora inicial) * 30
            Grados rotados: $grados
        """.trimIndent()
    }

    // Problema 3
    private fun problema3(a: Int, b: Int): String {
        val menor1 = (a + b - Math.abs(a - b)) / 2
        val menor2 = if ((a / b) == 0) a else b
        return """
            Números ingresados: a = $a, b = $b
            Resultado método 1: $menor1
            Resultado método 2: $menor2
        """.trimIndent()
    }

    // Problema 4
    private fun problema4(a: Int, b: Int): String {
        val areEqual = (a xor b) == 0
        return """
            Números ingresados: a = $a, b = $b
            ¿Son iguales?: $areEqual
        """.trimIndent()
    }

    // Problema 5
    private fun problema5(a: Int, b: Int): String {
        var suma = a
        repeat(b) { suma++ }
        return """
            Números ingresados: a = $a, b = $b
            Resultado de la suma: $suma
        """.trimIndent()
    }

    // Problema 6
    private fun problema6(n: Int, k: Int): String {
        fun factorial(x: Int): Int = if (x == 0) 1 else x * factorial(x - 1)
        val result = factorial(n) / (factorial(k) * factorial(n - k))
        return """
            Fórmula: C(n, k) = n! / (k!(n-k)!)
            Coeficiente Binomial C($n, $k): $result
        """.trimIndent()
    }

    // Problema 7
    private fun problema7(x1: Double, y1: Double, x2: Double, y2: Double): String {
        val distancia = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))
        return """
            Fórmula: √((x2 - x1)^2 + (y2 - y1)^2)
            Distancia: $distancia
        """.trimIndent()
    }

    // Problema 8
    private fun problema8(input: String): String {
        val numberMap = mapOf(
            "uno" to 1, "dos" to 2, "tres" to 3, "cuatro" to 4,
            "cinco" to 5, "seis" to 6, "siete" to 7, "ocho" to 8, "nueve" to 9,
            "diez" to 10, "cien" to 100, "doscientos" to 200,
            "trescientos" to 300, "cuatrocientos" to 400,
            "quinientos" to 500, "seiscientos" to 600,
            "setecientos" to 700, "ochocientos" to 800,
            "novecientos" to 900
        )
        val result = input.lowercase().split(" ").sumOf { numberMap[it] ?: 0 }
        return """
            Entrada: "$input"
            Número convertido: $result
        """.trimIndent()
    }
}
