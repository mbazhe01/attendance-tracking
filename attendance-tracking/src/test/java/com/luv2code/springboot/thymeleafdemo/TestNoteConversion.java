package com.luv2code.springboot.thymeleafdemo;

import java.sql.Timestamp;
import java.text.ParseException;

import com.luv2code.springboot.thymeleafdemo.entity.Note;
import com.luv2code.springboot.thymeleafdemo.entity.NoteTL;

public class TestNoteConversion {

	public static void main(String[] args) throws ParseException {
		try {
			// String dateInString = "27/02/2016 12:15";
			// SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm");
			Timestamp date = new Timestamp(System.currentTimeMillis());
			Note note = new Note(1, 4, date, "test note");
			System.out.println(note);
			System.out.println("Convert to NoteTL:");
			NoteTL noteTL = note.convertToNoteTL();
			System.out.println(noteTL);
			System.out.println("Convert to Note");
			// System.out.println(noteTL.convertToNote());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
