package com.myapp.kirat.theblogger;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import br.liveo.interfaces.OnItemClickListener;
import br.liveo.interfaces.OnPrepareOptionsMenuLiveo;
import br.liveo.model.HelpLiveo;
import br.liveo.navigationliveo.NavigationLiveo;

public class MainActivity extends NavigationLiveo implements OnItemClickListener {
    private HelpLiveo mHelpLiveo;

    @Override
    public void onInt(Bundle savedInstanceState) {
        this.userName.setText("Rudson Lima");
        this.userEmail.setText("rudsonlive@gmail.com");
        this.userPhoto.setImageResource(R.drawable.ic_rudsonlive);
        this.userBackground.setImageResource(R.drawable.ic_user_background_first);

        // Creating items navigation
        mHelpLiveo = new HelpLiveo();
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.ic_launcher_background, 7);
        mHelpLiveo.addSubHeader(getString(R.string.categories)); //Item subHeader
        mHelpLiveo.add(getString(R.string.starred), R.drawable.ic_launcher_background);
        mHelpLiveo.add(getString(R.string.sent_mail), R.drawable.ic_launcher_background);
        mHelpLiveo.addNoCheck(getString(R.string.drafts), R.drawable.ic_launcher_background);
        mHelpLiveo.addSeparator(); //Item separator
        mHelpLiveo.add(getString(R.string.trash), R.drawable.ic_launcher_background);
        mHelpLiveo.add(getString(R.string.spam), R.drawable.ic_launcher_background, 120);

        //{optional} - Header Customization - method customHeader
        //View mCustomHeader = getLayoutInflater().inflate(R.layout.custom_header_user, this.getListView(), false);
        //ImageView imageView = (ImageView) mCustomHeader.findViewById(R.id.imageView);
//
//        with(this).startingPosition(2) //Starting position in the list
//                .addAllHelpItem(mHelpLiveo.getHelp())
//                //{optional} - List Customization "If you remove these methods and the list will take his white standard color"
//                //.selectorCheck(R.drawable.selector_check) //Inform the background of the selected item color
//                //.colorItemDefault(R.color.nliveo_blue_colorPrimary) //Inform the standard color name, icon and counter
//                .colorItemSelected(R.color.nliveo_blue_colorPrimary) //State the name of the color, icon and meter when it is selected
//                //.backgroundList(R.color.nliveo_black_light) //Inform the list of background color
//                //.colorLineSeparator(R.color.nliveo_transparent) //Inform the color of the subheader line
//
//                //{optional} - SubHeader Customization
//                //.colorNameSubHeader(R.color.nliveo_blue_colorPrimary)
//                //.colorLineSeparator(R.color.nliveo_green_colorPrimaryDark)
//
//                //.removeFooter()
//                .footerItem(R.string.settings, R.drawable.ic_launcher_background)

                //{optional} - Second footer
                //.footerSecondItem(R.string.settings, R.drawable.ic_settings_black_24dp)

                //{optional} - Header Customization
                //.customHeader(mCustomHeader)

                //{optional} - Footer Customization
                //.footerNameColor(R.color.nliveo_blue_colorPrimary)
                //.footerIconColor(R.color.nliveo_blue_colorPrimary)

                //.footerSecondNameColor(R.color.nliveo_blue_colorPrimary)
                //.footerSecondIconColor(R.color.nliveo_blue_colorPrimary)

                //.footerBackground(R.color.nliveo_white)

                //{optional} - Remove color filter icon
                //.removeColorFilter()
//
//                .setOnClickUser(onClickPhoto)
//                .setOnPrepareOptionsMenu(onPrepare)
//                .setOnClickFooter(onClickFooter)

                //{optional} - Second footer
                //.setOnClickFooterSecond(onClickFooter)
             //   .build();

        with(this) // default theme is dark
                .startingPosition(2) //Starting position in the list
                .addAllHelpItem(mHelpLiveo.getHelp())
                .footerItem(R.string.settings, R.drawable.ic_launcher_background)
                .setOnClickUser(onClickPhoto)
                .setOnPrepareOptionsMenu(onPrepare)
                .setOnClickFooter(onClickFooter)
                .build();
//        this.setElevationToolBar(position != 2 ? 15 : 0);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    public void onItemClick(int position) {


    }
    private OnPrepareOptionsMenuLiveo onPrepare = new OnPrepareOptionsMenuLiveo() {
        @Override
        public void onPrepareOptionsMenu(Menu menu, int position, boolean visible) {
        }
    };
    private View.OnClickListener onClickFooter = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            closeDrawer();
        }
    };
    private View.OnClickListener onClickPhoto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            closeDrawer();
        }
    };
}
