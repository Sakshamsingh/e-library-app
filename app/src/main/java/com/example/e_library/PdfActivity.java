package com.example.e_library;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PdfActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        mySearchView = findViewById(R.id.searchView);
        myList = findViewById(R.id.myList);


        String[] values = new String[]{"The Miracle Morning" , "The Power of Concentration" ,
                "The Book of Five Rings" , "Atomic Habits : Tiny Changes" ,
                "The 5 Second Rule" , "12 Rules of Life" , "Think and Grow Rich" , "48 Rules of Power" ,
                "Harry Potter and Sorcerer's Stone" , "Game of thrones" ,
                "A Clash of Kings" , "Harry potter and half blood Prince" , "Harry Potter and the Order Of The Phoenix" ,
                "Harry Potter and Goblet of Fire" , "harry potter and prisoner of azkaban" ,
                "Harry Potter and Chamber of Secrets"};

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,values );
        myList.setAdapter(adapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if ( i  == 0){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://trans4mind.com/download-pdfs/The%2520Miracle%2520Morning.pdf&ved=2ahUKEwj7xOjbn6T0AhUjheYKHcEiB-cQFnoECAQQAQ&usg=AOvVaw00wZg06Inw1YTsfcHafYax");
                }
                if ( i == 1){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.templeofearth.com/books/concentration.pdf&ved=2ahUKEwjktZzwn6T0AhVvILcAHcB_DcAQFnoECAUQAQ&usg=AOvVaw2zvGjtWwLy7qOookQJx90-");
                }
                if ( i == 2){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.holybooks.com/wp-content/uploads/The-Book-of-Five-Rings-by-Musashi-Miyamoto.pdf&ved=2ahUKEwisiZ2OoKT0AhUCH7cAHcmaDYwQFnoECAQQAQ&usg=AOvVaw2wKS3V2AWlWa9tbcRdjoGG");
                }
                if ( i == 3){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://icrrd.com/media/01-11-2020-043223Atomic%2520Habits%2520-%2520James%2520Clear.pdf&ved=2ahUKEwjTlfGkoKT0AhUrILcAHbXMClwQFnoECAYQAQ&usg=AOvVaw0kHsBRvrzyVHq-mzPVihFW");
                }
                if ( i == 4){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://mundeyyoungdotcom.files.wordpress.com/2018/09/the-5-second-rule_-transform-your-life-wo-mel-robbins.pdf&ved=2ahUKEwix0IPCoKT0AhXDV3wKHe5hAbgQFnoECAMQAQ&usg=AOvVaw3Rm2K_Ik_HoIx6-2EkIb2p");
                }
                if ( i == 5){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://nasihah.net/wp-content/uploads/books/12-Rules-for-Life.pdf&ved=2ahUKEwj56ZLboKT0AhV77XMBHVlZA2gQFnoECAUQAQ&usg=AOvVaw0RTH-eQ6-KNCyLgfTZjQqH");
                }
                if ( i == 6){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://manageo.io/wp-content/uploads/2018/08/Think-And-Grow-Rich.pdf&ved=2ahUKEwi4kdTFlKT0AhW49nMBHUseAUQQFnoECAQQAQ&usg=AOvVaw251OeT4K7izj_xq1PXyX2I");
                }
                if ( i == 7){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://irp-cdn.multiscreensite.com/cb9165b2/files/uploaded/The%252048%2520Laws%2520Of%2520Power.pdf&ved=2ahUKEwjy04L5oKT0AhUHkNgFHUKrCJ8QFnoECAYQAQ&usg=AOvVaw279Itun_X8DOwLZILxycNu");
                }
                if ( i == 8){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=http://www.passuneb.com/elibrary/ebooks/Harry%2520Potter%2520and%2520The%2520Sorcerer%25E2%2580%2599s%2520Stone.pdf&ved=2ahUKEwjE8rWZ98L0AhVMQd4KHW4TBIMQFnoECAMQAQ&usg=AOvVaw0BIkwKm-zBFbKpMpmls4yE");
                }
                if ( i == 9){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.nothuman.net/images/files/discussion/2/1815b71a2e633176b1c509f3a186605b.pdf&ved=2ahUKEwis2omk-cL0AhWNaN4KHSx6ArYQFnoECCIQAQ&usg=AOvVaw0iaym7_qxl2bH6E1cNnAN1");
                }
                if ( i == 10){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.nothuman.net/images/files/discussion/2/bc2d525a2ac485f688a1f2dcb7740432.pdf&ved=2ahUKEwj3jaeI-sL0AhXBfXAKHXQ5Cw0QFnoECAYQAQ&usg=AOvVaw2Rmzy96CDB0XHwKloQfSYD");
                }
                if ( i == 11){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=http://www.passuneb.com/elibrary/ebooks/Harry%2520Potter%2520and%2520The%2520Half-Blood%2520Prince.pdf&ved=2ahUKEwjT3-uO-cL0AhWIA4gKHa44Bs8QFnoECAYQAQ&usg=AOvVaw10mwUgv1JzDmFUwt_rayI4");
                }
                if ( i == 12){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.missskirtich.com/uploads/2/3/3/7/23374820/5_-_harry_potter_and_the_order_of_the_phoenix_chapter_37.pdf&ved=2ahUKEwjQy_rS-ML0AhXUZt4KHachDMAQFnoECAcQAQ&usg=AOvVaw37WKenDSHQCZ_X51qPq97q");
                }
                if ( i == 13){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=https://www.info24service.com/wp-content/uploads/4-Harry-Potter-and-the-Goblet-of-Fire_US_ISBN-0-439-13959-7_2014-191-1447.pdf&ved=2ahUKEwi4nqLB-ML0AhXHMd4KHcJBC0gQFnoECAUQAQ&usg=AOvVaw1mAlHcXhWh-kilEVQqsG2A");
                }
                if ( i == 14){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=http://www.passuneb.com/elibrary/ebooks/HARRY%2520POTTER%2520AND%2520THE%2520PRISONER%2520OF%2520AZKABAN.pdf&ved=2ahUKEwjPg7eN-ML0AhWIZd4KHd3WBrwQFnoECAUQAQ&usg=AOvVaw1tlZfx3de2TxZAch5IGVx8");
                }
                if ( i == 15){
                    gotoUrl("https://www.google.co.in/url?sa=t&source=web&rct=j&url=http://www.apsmhow.org/Library%2520Portal/index_htm_files/Harry%2520Potter%2520and%2520the%2520%2520CHAMBER%2520OF%2520SECRETS.pdf&ved=2ahUKEwjP4Izp98L0AhWLFIgKHdjPDgUQFnoECAMQAQ&usg=AOvVaw2uCRzrLAw2_KpeaaAlCHJS");
                }
            }
        });

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);

                return false;
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}