package com.example.mygarage.ui.reservations.datetime.startdate

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.example.mygarage.ui.reservations.ReservationsViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import java.util.*

class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {
    private val viewModel: ReservationsViewModel by sharedViewModel()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current date as the default date in the picker
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        c.add(Calendar.DATE, 0) // set past calendar dates to 0

        // Create a new instance of DatePickerDialog and return datePickerDialog
        val datePickerDialog = DatePickerDialog(requireActivity(), this, year, month, day)
        val newDate = c.time
        // set minimum date that the user can select to today
        datePickerDialog.datePicker.minDate = newDate.time - newDate.time % (24 * 60 * 60 * 1000)
        return datePickerDialog
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
        // Do something with the date chosen by the user
        viewModel.selectDate(day,month,year)
        showTimePickerDialog()
    }
    private fun showTimePickerDialog() {
        val newFragment = TimePickerFragment()
        newFragment.show(requireActivity().supportFragmentManager, "datePicker")
    }
}