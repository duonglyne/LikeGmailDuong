package com.duonglyne.duonggmail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.duonglyne.duonggmail.R;
import com.duonglyne.duonggmail.NoteListAdapter;
import com.duonglyne.duonggmail.NoteModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView list;
    NoteListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitle("New Title Toolbar");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        list = (ListView) findViewById(R.id.my_list);
        final ArrayList<NoteModel> list2 = getDataList();
        adapter = new NoteListAdapter(MainActivity.this, list2);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                NoteModel note = list2.get(position);

                Toast.makeText(MainActivity.this, "Item Of List Is " + note.getNoteTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public ArrayList<NoteModel> getDataList() {

        ArrayList<NoteModel> list = new ArrayList<>();

        list.add(new NoteModel("Ly Van Duong"
                ,"The current version of the design support library does come with its limitations. " +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Duong Van Ly"
                ,"The current version of the design support library does come with its limitations." +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Van Ly Duong"
                ,"The current version of the design support library does come with its limitations. " +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Lyne Duong"
                ,"The current version of the design support library does come with its limitations." +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Hoang Anh"
                ,"The current version of the design support library does come with its limitations. " +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Ong Duong"
                ,"The current version of the design support library does come with its limitations." +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Cau Duong"
                ,"The current version of the design support library does come with its limitations. " +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Duong hihi"
                ,"The current version of the design support library does come with its limitations." +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Ba Duong"
                ,"The current version of the design support library does come with its limitations. " +
                "The main issue is with the system that highlights the current item in the navigation menu."));
        list.add(new NoteModel("Kim Duong"
                ,"The current version of the design support library does come with its limitations." +
                "The main issue is with the system that highlights the current item in the navigation menu."));

        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.setting:
                Toast.makeText(MainActivity.this, "Setting Menu Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_edit:

                Toast.makeText(MainActivity.this, "Edit Menu Clicked", Toast.LENGTH_SHORT).show();

                break;

            case R.id.menu_delete:
                Toast.makeText(MainActivity.this, "Delete Menu Clicked", Toast.LENGTH_SHORT).show();

                break;

            default:
                Toast.makeText(MainActivity.this, "No Menu Found", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
