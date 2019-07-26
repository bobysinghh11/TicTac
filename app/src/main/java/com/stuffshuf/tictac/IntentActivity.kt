package com.stuffshuf.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.util.rangeTo
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {

    var activePlayer = 0
    var count=0
    var player2=0
    var player1=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val actionbar= supportActionBar
        actionbar?.title=""
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayShowHomeEnabled(true)

        tvplayer1.text="0"
        tvplayer2.text="0"
        win1.text="0"
        win2.text="0"


            btn1.setOnClickListener {
                if (btn1.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn1.text = "X"
                        winGame()
                     //   tieGame()


                    } else {

                        activePlayer --
                        btn1.text = "0"
                        winGame()
                      //  tieGame()


                    }

                }


            }
            btn2.setOnClickListener {

                if (btn2.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn2.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn2.text = "0"
                        winGame()


                    }

                }

            }

            btn3.setOnClickListener {

                if (btn3.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn3.text = "X"
                        winGame()



                    } else {

                        activePlayer--
                        btn3.text = "0"
                        winGame()


                    }

                }

            }
            btn4.setOnClickListener {

                if (btn4.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn4.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn4.text = "0"
                        winGame()


                    }

                }
            }

            btn5.setOnClickListener {

                if (btn5.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn5.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn5.text = "0"
                        winGame()


                    }

                }
            }

            btn6.setOnClickListener {

                if (btn6.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn6.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn6.text = "0"
                        winGame()


                    }

                }

            }

            btn7.setOnClickListener {

                if (btn7.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn7.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn7.text = "0"
                        winGame()


                    }

                }
            }


            btn8.setOnClickListener {

                if (btn8.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn8.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn8.text = "0"
                        winGame()


                    }

                }
            }

            btn9.setOnClickListener {
                if (btn9.text.toString() == "") {

                    if (activePlayer == 0) {
                        activePlayer++
                        btn9.text = "X"
                        winGame()



                    } else {
                        activePlayer--
                        btn9.text = "0"
                        winGame()


                    }

                }
            }


            btnReset.setOnClickListener {

                btn1.text=""
                btn2.text=""
                btn3.text=""
                btn4.text=""
                btn5.text=""
                btn6.text=""
                btn7.text=""
                btn8.text=""
                btn9.text=""
                activePlayer=0
                tvplayer1.text=0.toString()
                tvplayer2.text=0.toString()
                player1=0
                player2=0
            }

        }

/*private fun tieGame()
 {

    /* if (tvplayer1.text=="0" && tvplayer2.text=="0")
 {
     Toast.makeText(this, "Game Tie ", Toast.LENGTH_LONG).show()
 }
 */
/*if (win1.text!="Win" && win2.text!="Win")
{
  Toast.makeText(this, "Game Tie ", Toast.LENGTH_LONG).show()

}
*/

if (player1.toString()!="player1++" && player2.toString()!="player2++")
{
 Toast.makeText(this, "Game Tie ", Toast.LENGTH_LONG).show()
}


} */



private fun winGame() {


/*  <---- For Player1--> X  ---->*/


if (btn1.text.toString()== "X" && btn2.text.toString()== "X" && btn3.text.toString()=="X")
{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++
tvplayer1.text= player1.toString()
win1.text="win"
resetResult()
}

else if (btn4.text.toString()=="X" && btn5.text.toString()=="X" && btn6.text.toString()=="X")
{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++

tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}

else if (btn7.text.toString()=="X" && btn8.text.toString()=="X" && btn9.text.toString()=="X")

{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++

tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}

else if (btn1.text.toString()=="X" && btn5.text.toString()=="X" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++

tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}
else if (btn3.text.toString()=="X" && btn5.text.toString()=="X" && btn7.text.toString()=="X")

{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++
tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}

else if (btn1.text.toString()=="X" && btn4.text.toString()=="X" && btn7.text.toString()=="X")
{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++
tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}

else if (btn2.text.toString()=="X" && btn5.text.toString()=="X" && btn8.text.toString()=="X")

{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++
tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}

else if (btn3.text.toString()=="X" && btn6.text.toString()=="X" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Player1 Win ", Toast.LENGTH_LONG).show()
player1++
tvplayer1.text= player1.toString()
win1.text="1"
resetResult()
}





/*   For Player Two --> 0  */


if (btn1.text.toString()== "0" && btn2.text.toString()== "0" && btn3.text.toString()=="0")
{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}


else if(btn4.text.toString()=="0" && btn5.text.toString()=="0" && btn6.text.toString()=="0") {

Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()


}
else if (btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}

else if (btn1.text.toString()== "0" && btn4.text.toString()== "0" && btn7.text.toString()=="0")
{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()

}

else if (btn2.text.toString()=="0" && btn5.text.toString()=="0" && btn8.text.toString()=="0")
{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}

else if (btn3.text.toString()=="0" && btn6.text.toString()=="0" && btn9.text.toString()=="0")

{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}
else if (btn1.text.toString()=="0" && btn5.text.toString()=="0" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}
else if (btn3.text.toString()=="0" && btn5.text.toString()=="0" && btn7.text.toString()=="0")

{
Toast.makeText(this, "Player2 Win ", Toast.LENGTH_LONG).show()
player2++
tvplayer2.text= player2.toString()
win2.text="1"
resetResult()
}


else if (tvplayer1.text=="2" || tvplayer2.text=="2")
{


if (player1>player2)
{
    resetResult()
    tvplayer1.text="0"
    tvplayer2.text="0"
  Toast.makeText(this, "Final Player1 Win ", Toast.LENGTH_LONG).show()



}

else
{

    resetResult()
    tvplayer1.text="0"
    tvplayer2.text="0"
  Toast.makeText(this, "Final Player2 Win ", Toast.LENGTH_LONG).show()



}
}









/*   Game Tie

else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}


else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}


else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="X" &&
btn5.text.toString()=="0" && btn6.text.toString()=="X" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="0" && btn6.text.toString()=="X" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="0" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="0" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="0" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="0" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="O" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="X" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="0" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="X" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="X" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="0" && btn6.text.toString()=="0" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="0" &&
btn5.text.toString()=="X" && btn6.text.toString()=="X" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="0" && btn4.text.toString()=="X" &&
btn5.text.toString()=="X" && btn6.text.toString()=="0" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}

else if (btn1.text.toString()=="X" && btn2.text.toString()=="0" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="0" && btn6.text.toString()=="X" && btn7.text.toString()=="0" && btn8.text.toString()=="X" && btn9.text.toString()=="0")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}
else if (btn1.text.toString()=="0" && btn2.text.toString()=="X" && btn3.text.toString()=="X" && btn4.text.toString()=="X" &&
btn5.text.toString()=="0" && btn6.text.toString()=="0" && btn7.text.toString()=="X" && btn8.text.toString()=="0" && btn9.text.toString()=="X")
{
Toast.makeText(this, "Gmae Tie ", Toast.LENGTH_LONG).show()
resetResult()
}


*/


}



private fun resetResult(){

btn1.text=""
btn2.text=""
btn3.text=""
btn4.text=""
btn5.text=""
btn6.text=""
btn7.text=""
btn8.text=""
btn9.text=""
activePlayer=0








}

override fun onSupportNavigateUp(): Boolean {
onBackPressed()
return super.onSupportNavigateUp()
}




}


