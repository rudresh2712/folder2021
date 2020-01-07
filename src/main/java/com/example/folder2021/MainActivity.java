package com.example.folder2021;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.folder2021.Util.Util;
import com.example.folder2021.data.DatabaseHandler;
import com.example.folder2021.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private ArrayList<String> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      //  listView=findViewById(R.Id.listview);
        contactArrayList=new ArrayList<>();
        DatabaseHandler db=new DatabaseHandler(MainActivity.this);


        //create contact object

//        Contact jeremy=new Contact();
//        jeremy.setName("jeeereeemyyy");
//        jeremy.setPhone_number("54686513");
//
//        Contact json = new Contact();
//        json.setName("jaaaason");
//        json.setPhone_number("8795546887");
//
//        db.addContact(jeremy);
//        db.addContact(json);
        // to display just the one contact

        Contact c = db.getContact(48);
        c.setName("newJeremy");
        c.setPhone_number("84516843");

        int update= db.update(c);
        Log.d("row","onCreate"+update);


        Log.d("MainActivity","updated "+c.getName()+", "+c.getPhone_number()+"and the count of database is"+db.getCount());
      // db.deleteContact(c);


        // contact list here
        List<Contact> contactList=db.getAllContacts();
        for(Contact contact: contactList){                   //this is a for each loop
            Log.d("MainActivity","onCreate from contact list "+contact.getId() +"  "+contact.getName());
             contactArrayList.add(contact.getName());
        }


//        //create array adapter
//        arrayAdapter= new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                contactArrayList
//        );
//
//
//        //add to our list
//        listView.setAdapter(arrayAdapter);
//
    }
}
