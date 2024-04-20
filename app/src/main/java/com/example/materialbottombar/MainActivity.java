package com.example.materialbottombar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//      number of selected tab. we have 4 tabs so value must lie between 1-4. Default value is 1 because first tab is select by default
    private int selectedTab=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout homeLayout=findViewById(R.id.homeLayout);
        final LinearLayout bookmarkLayout=findViewById(R.id.bookmarkLayout);
        final LinearLayout notificationLayout=findViewById(R.id.notificationLayout);
        final LinearLayout profileLayout=findViewById(R.id.profileLayout);

        final ImageView homeImage=findViewById(R.id.home_image);
        final ImageView bookmarkImage=findViewById(R.id.bookmark_image);
        final ImageView notificationImage=findViewById(R.id.notification_image);
        final ImageView profileImage=findViewById(R.id.profile_image);

        final TextView homeText=findViewById(R.id.home_text);
        final TextView bookmarkText=findViewById(R.id.bookmark_text);
        final TextView notificationText=findViewById(R.id.notification_text);
        final TextView profileText=findViewById(R.id.profile_text);

//        set home fragment by default
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container,homeFragment.class,null)
                .commit();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                check is home is already selected or not
                if (selectedTab!=1){

//                    set home fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container,homeFragment.class,null)
                            .commit();

//                    unselect other tabs expect home tab

                    profileText.setVisibility(View.GONE);
                    bookmarkText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);

                    profileImage.setImageResource(R.drawable.profile);
                    bookmarkImage.setImageResource(R.drawable.bookmark);
                    notificationImage.setImageResource(R.drawable.alert);

                    profileLayout.setBackgroundColor(Color.TRANSPARENT);
                    bookmarkLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);

//                    select home tab
                    homeText.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.home_selected);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

//                    Create animation
                    ScaleAnimation scaleAnimation=new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

//                    set 1st tab as selected
                    selectedTab=1;
                }

            }
        });

        bookmarkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                check is home is already selected or not
                if (selectedTab!=2){

//                    set bookmark fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container,bookmarkFragment.class,null)
                            .commit();

//                    unselect other tabs expect home tab

                    profileText.setVisibility(View.GONE);
                    homeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);

                    profileImage.setImageResource(R.drawable.profile);
                    homeImage.setImageResource(R.drawable.home);
                    notificationImage.setImageResource(R.drawable.alert);

                    profileLayout.setBackgroundColor(Color.TRANSPARENT);
                    homeLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);

//                    select home tab
                    bookmarkText.setVisibility(View.VISIBLE);
                    bookmarkImage.setImageResource(R.drawable.bookmark_selected);
                    bookmarkLayout.setBackgroundResource(R.drawable.round_back_bookmar);

//                    Create animation
                    ScaleAnimation scaleAnimation=new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    bookmarkLayout.startAnimation(scaleAnimation);

//                    set 1st tab as selected
                    selectedTab=2;
                }
            }
        });
        notificationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                check is home is already selected or not
                if (selectedTab!=3){

//                    set notification fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container,notificationFragment.class,null)
                            .commit();

//                    unselect other tabs expect home tab

                    profileText.setVisibility(View.GONE);
                    bookmarkText.setVisibility(View.GONE);
                    homeText.setVisibility(View.GONE);

                    profileImage.setImageResource(R.drawable.profile);
                    bookmarkImage.setImageResource(R.drawable.bookmark);
                    homeImage.setImageResource(R.drawable.home);

                    profileLayout.setBackgroundColor(Color.TRANSPARENT);
                    bookmarkLayout.setBackgroundColor(Color.TRANSPARENT);
                    homeLayout.setBackgroundColor(Color.TRANSPARENT);

//                    select home tab
                    notificationText.setVisibility(View.VISIBLE);
                    notificationImage.setImageResource(R.drawable.alert_selected);
                    notificationLayout.setBackgroundResource(R.drawable.round_back_notification);

//                    Create animation
                    ScaleAnimation scaleAnimation=new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    notificationLayout.startAnimation(scaleAnimation);

//                    set 1st tab as selected
                    selectedTab=3;
                }
            }
        });
        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                check is profile is already selected or not
                if (selectedTab!=4){
//                    set profile fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container,profileFragment.class,null)
                            .commit();
//                    unselect other tabs expect home tab

                    homeText.setVisibility(View.GONE);
                    bookmarkText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home);
                    bookmarkImage.setImageResource(R.drawable.bookmark);
                    notificationImage.setImageResource(R.drawable.alert);

                    homeLayout.setBackgroundColor(Color.TRANSPARENT);
                    bookmarkLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);

//                    select home tab
                    profileText.setVisibility(View.VISIBLE);
                    profileImage.setImageResource(R.drawable.profile_selected);
                    profileLayout.setBackgroundResource(R.drawable.round_back_profile);

//                    Create animation
                    ScaleAnimation scaleAnimation=new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

//                    set 1st tab as selected
                    selectedTab=4;
                }
            }
        });

    }
}