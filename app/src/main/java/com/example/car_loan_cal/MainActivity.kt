package com.example.car_loan_cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            //bhbhbh
            calLoan()
        }
    }

    private fun calLoan(){
        val carPrice:Double = carprice.text.toString().toDouble()
        val downPayment:Double = downpayment.text.toString().toDouble()
        val period:Double = loanperiod.text.toString().toDouble()
        val interestRate:Double = interestrate.text.toString().toDouble()

        val carLoan:Double = carPrice - downPayment
        val interest:Double = carLoan * interestRate * period
        val monthlyRepayment = (carLoan + interest) / period / 12

        viewcarLoan.text = "RM %.2f".format(carLoan)
        viewInterest.text = "RM %.2f".format(interest)
        viewMonPayment.text = "RM %.2f".format(monthlyRepayment)

    }
}
