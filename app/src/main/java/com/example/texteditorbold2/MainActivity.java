package com.example.texteditorbold2;

import static android.graphics.Typeface.*;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_Main;
    ImageButton btn_Copy;
    String original_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize edit text
        initialize();


    }

    private void initialize() {
        et_Main = findViewById(R.id.et_Main);
    }

    public void buttonCopy(View view){
        ClipboardManager clipboardManager= (ClipboardManager) this.getSystemService(this.CLIPBOARD_SERVICE);
        ClipData clipData=(ClipData) ClipData.newPlainText("text",et_Main.getText());
        clipboardManager.setPrimaryClip(clipData);

        Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show();
    }

    public void buttonBold(View view) {

        et_Main.setTypeface(DEFAULT_BOLD);
    }

    public void buttonItalic(View view) {


        et_Main.setTypeface(null, ITALIC);
    }

    public void buttonUnderline(View view) {

        Spannable spannableString = new SpannableStringBuilder(et_Main.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        et_Main.setText(spannableString);
    }

    public void buttonNoFormat(View view) {

        et_Main.setTypeface(null, NORMAL);
        et_Main.setPaintFlags(et_Main.getPaintFlags() & (~Paint.UNDERLINE_TEXT_FLAG));
    }


    public void buttonLeftAlign(View view) {

        et_Main.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        Spannable spannableString = new SpannableStringBuilder(et_Main.getText());
        et_Main.setText(spannableString);
    }


    public void buttonCenterAlign(View view) {
        et_Main.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Spannable spannableString = new SpannableStringBuilder(et_Main.getText());
        et_Main.setText(spannableString);
    }


    public void buttonRightAlign(View view) {
        et_Main.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        Spannable spannableString = new SpannableStringBuilder(et_Main.getText());
        et_Main.setText(spannableString);
    }

    public void buttonAclonica(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/aclonica.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonAbrilFatFace(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/abril_fatface.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonAldRich(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/aldrich.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonBungeeShade(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/bungee_shade.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonKingThing(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/kingthings.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonRothenBurg(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/rothenburg.ttf");
        et_Main.setTypeface(typeface);
    }

    public void buttonSuissnord(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/suissnord.otf");
        et_Main.setTypeface(typeface);
    }

    public void buttonLibrary(View view) {
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/library.otf");
        et_Main.setTypeface(typeface);
    }

    public void buttonStyle1(View view){

        if (et_Main.getText().toString().matches(".*[a-z].*") || (et_Main.getText().toString().matches(".*[A-Z].*"))) {
            original_text= et_Main.getText().toString();
        }

//        𝗮 𝗯 𝗰 𝗱 𝗲 𝗳 𝗴 𝗵 𝗶 𝗷 𝗸 𝗹 𝗺 𝗼 𝗽 𝗾 𝗿 𝘀 𝘁 𝘂 𝘃 𝘄 𝘅 𝘆 𝘇 𝟭𝟮𝟯𝟰𝟱𝟲𝟳𝟴𝟵𝟬
//        𝗔 𝗕 𝗖 𝗗 𝗘 𝗙 𝗚 𝗛 𝗜 𝗝 𝗞 𝗟 𝗠 𝗢 𝗣 𝗤 𝗥 𝗦 𝗧 𝗨 𝗩 𝗪 𝗫 𝗬 𝗭

        String strImport = original_text;
        strImport = strImport.replaceAll("A", "\uD835\uDDD4");
        strImport = strImport.replaceAll("B", "\uD835\uDDD5");
        strImport = strImport.replaceAll("C", "\uD835\uDDD6");
        strImport = strImport.replaceAll("D", "\uD835\uDDD7");
        strImport = strImport.replaceAll("E", "\uD835\uDDD8");
        strImport = strImport.replaceAll("F", "\uD835\uDDD9");
        strImport = strImport.replaceAll("G", "\uD835\uDDDA");
        strImport = strImport.replaceAll("H", "\uD835\uDDDB");
        strImport = strImport.replaceAll("I", "\uD835\uDDDC");
        strImport = strImport.replaceAll("J", "\uD835\uDDDD");
        strImport = strImport.replaceAll("K", "\uD835\uDDDE");
        strImport = strImport.replaceAll("L", "\uD835\uDDDF");
        strImport = strImport.replaceAll("M", "\uD835\uDDE0");
        strImport = strImport.replaceAll("N", "\uD835\uDDE1");
        strImport = strImport.replaceAll("O", "\uD835\uDDE2");
        strImport = strImport.replaceAll("P", "\uD835\uDDE3");
        strImport = strImport.replaceAll("Q", "\uD835\uDDE4");
        strImport = strImport.replaceAll("R", "\uD835\uDDE5");
        strImport = strImport.replaceAll("S", "\uD835\uDDE6");
        strImport = strImport.replaceAll("T", "\uD835\uDDE7");
        strImport = strImport.replaceAll("U", "\uD835\uDDE8");
        strImport = strImport.replaceAll("V", "\uD835\uDDE9");
        strImport = strImport.replaceAll("W", "\uD835\uDDEA");
        strImport = strImport.replaceAll("X", "\uD835\uDDEB");
        strImport = strImport.replaceAll("Y", "\uD835\uDDEC");
        strImport = strImport.replaceAll("Z", "\uD835\uDDED");

        //Small a, b, b...
     //   𝗮 𝗯 𝗰 𝗱 𝗲 𝗳 𝗴 𝗵 𝗶 𝗷 𝗸 𝗹 𝗺 𝗼 𝗽 𝗾 𝗿 𝘀 𝘁 𝘂 𝘃 𝘄 𝘅 𝘆 𝘇
        strImport = strImport.replaceAll("a", "\uD835\uDDEE");
        strImport = strImport.replaceAll("b", "\uD835\uDDEF");
        strImport = strImport.replaceAll("c", "\uD835\uDDF0");
        strImport = strImport.replaceAll("d", "\uD835\uDDF1");
        strImport = strImport.replaceAll("e", "\uD835\uDDF2");
        strImport = strImport.replaceAll("f", "\uD835\uDDF3");
        strImport = strImport.replaceAll("g", "\uD835\uDDF4");
        strImport = strImport.replaceAll("h", "\uD835\uDDF5");
        strImport = strImport.replaceAll("i", "\uD835\uDDF6");
        strImport = strImport.replaceAll("j", "\uD835\uDDF7");
        strImport = strImport.replaceAll("k", "\uD835\uDDF8");
        strImport = strImport.replaceAll("l", "\uD835\uDDF9");
        strImport = strImport.replaceAll("m", "\uD835\uDDFA");
        strImport = strImport.replaceAll("n", "\uD835\uDDFB");
        strImport = strImport.replaceAll("o", "\uD835\uDDFC");
        strImport = strImport.replaceAll("p", "\uD835\uDDFD");
        strImport = strImport.replaceAll("q", "\uD835\uDDFE");
        strImport = strImport.replaceAll("r", "\uD835\uDDFF");
        strImport = strImport.replaceAll("s", "\uD835\uDE00");
        strImport = strImport.replaceAll("t", "\uD835\uDE01");
        strImport = strImport.replaceAll("u", "\uD835\uDE02");
        strImport = strImport.replaceAll("v", "\uD835\uDE03");
        strImport = strImport.replaceAll("w", "\uD835\uDE04");
        strImport = strImport.replaceAll("x", "\uD835\uDE05");
        strImport = strImport.replaceAll("y", "\uD835\uDE06");
        strImport = strImport.replaceAll("z", "\uD835\uDE07");


        // 1 2 3

        //𝟭 𝟮 𝟯 𝟰 𝟱 𝟲 𝟳 𝟴 𝟵 𝟬
        strImport = strImport.replaceAll("0", "\uD835\uDFEC");
        strImport = strImport.replaceAll("1", "\uD835\uDFED");
        strImport = strImport.replaceAll("2", "\uD835\uDFEE");
        strImport = strImport.replaceAll("3", "\uD835\uDFEF");
        strImport = strImport.replaceAll("4", "\uD835\uDFF0");
        strImport = strImport.replaceAll("5", "\uD835\uDFF1");
        strImport = strImport.replaceAll("6", "\uD835\uDFF2");
        strImport = strImport.replaceAll("7", "\uD835\uDFF3");
        strImport = strImport.replaceAll("8", "\uD835\uDFF4");
        strImport = strImport.replaceAll("9", "\uD835\uDFF5");

        //



//        String strImport = et_Main.getText().toString();
//        strImport = strImport.replaceAll("A", "\uD835\uDC00");
//        strImport = strImport.replaceAll("B", "\uD835\uDC01");
//        strImport = strImport.replaceAll("C", "\uD835\uDC02");
//        strImport = strImport.replaceAll("D", "\uD835\uDC03");
//        strImport = strImport.replaceAll("E", "\uD835\uDC04");
//        strImport = strImport.replaceAll("F", "\uD835\uDC05");
//        strImport = strImport.replaceAll("G", "\uD835\uDC06");
//        strImport = strImport.replaceAll("H", "\uD835\uDC07");
//        strImport = strImport.replaceAll("I", "\uD835\uDC08");
//        strImport = strImport.replaceAll("J", "\uD835\uDC09");
//        strImport = strImport.replaceAll("K", "\uD835\uDC0A");
//        strImport = strImport.replaceAll("L", "\uD835\uDC0B");
//        strImport = strImport.replaceAll("M", "\uD835\uDC0C");
//        strImport = strImport.replaceAll("N", "\uD835\uDC0D");
//        strImport = strImport.replaceAll("O", "\uD835\uDC0E");
//        strImport = strImport.replaceAll("P", "\uD835\uDC0F");
//        strImport = strImport.replaceAll("Q", "\uD835\uDC10");
//        strImport = strImport.replaceAll("R", "\uD835\uDC11");
//        strImport = strImport.replaceAll("S", "\uD835\uDC12");
//        strImport = strImport.replaceAll("T", "\uD835\uDC13");
//        strImport = strImport.replaceAll("U", "\uD835\uDC14");
//        strImport = strImport.replaceAll("V", "\uD835\uDC15");
//        strImport = strImport.replaceAll("W", "\uD835\uDC16");
//        strImport = strImport.replaceAll("X", "\uD835\uDC17");
//        strImport = strImport.replaceAll("Y", "\uD835\uDC18");
//        strImport = strImport.replaceAll("Z", "\uD835\uDC19");
//
//        //Small a, b, b...
//
//        strImport = strImport.replaceAll("a", "\uD835\uDC1A");
//        strImport = strImport.replaceAll("b", "\uD835\uDC1B");
//        strImport = strImport.replaceAll("c", "\uD835\uDC1C");
//        strImport = strImport.replaceAll("d", "\uD835\uDC1D");
//        strImport = strImport.replaceAll("e", "\uD835\uDC1E");
//        strImport = strImport.replaceAll("f", "\uD835\uDC1F");
//        strImport = strImport.replaceAll("g", "\uD835\uDC20");
//        strImport = strImport.replaceAll("h", "\uD835\uDC21");
//        strImport = strImport.replaceAll("i", "\uD835\uDC22");
//        strImport = strImport.replaceAll("j", "\uD835\uDC23");
//        strImport = strImport.replaceAll("k", "\uD835\uDC24");
//        strImport = strImport.replaceAll("l", "\uD835\uDC25");
//        strImport = strImport.replaceAll("m", "\uD835\uDC26");
//        strImport = strImport.replaceAll("n", "\uD835\uDC27");
//        strImport = strImport.replaceAll("o", "\uD835\uDC28");
//        strImport = strImport.replaceAll("p", "\uD835\uDC29");
//        strImport = strImport.replaceAll("q", "\uD835\uDC2A");
//        strImport = strImport.replaceAll("r", "\uD835\uDC2B");
//        strImport = strImport.replaceAll("s", "\uD835\uDC2C");
//        strImport = strImport.replaceAll("t", "\uD835\uDC2D\t");
//        strImport = strImport.replaceAll("u", "\uD835\uDC2E");
//        strImport = strImport.replaceAll("v", "\uD835\uDC2F");
//        strImport = strImport.replaceAll("w", "\uD835\uDC30");
//        strImport = strImport.replaceAll("x", "\uD835\uDC31");
//        strImport = strImport.replaceAll("y", "\uD835\uDC32");
//        strImport = strImport.replaceAll("z", "\uD835\uDC33");
//

                        et_Main.setText(strImport);
    }

    public void buttonStyle2_Italic(View view){

        if (et_Main.getText().toString().matches(".*[a-z].*") || (et_Main.getText().toString().matches(".*[A-Z].*"))) {
            original_text= et_Main.getText().toString();
        }


     //   𝘈 𝘉 𝘊 𝘋 𝘌 𝘍 𝘎 𝘏 𝘐 𝘑 𝘒 𝘓 𝘔 𝘕 𝘖 𝘗 𝘘 𝘙 𝘚 𝘛 𝘜 𝘝 𝘞 𝘟 𝘠 𝘡
      //  𝘢 𝘣 𝘤 𝘥 𝘦 𝘧 𝘨 𝘩 𝘪 𝘫 𝘬 𝘭 𝘮 𝘯 𝘰 𝘱 𝘲 𝘳 𝘴 𝘵 𝘶 𝘷 𝘸 𝘹 𝘺 𝘻
     //   0 1 2 3 4 5 6 7 8 9

            // A B C
        String strImport2 = original_text;
        strImport2 = strImport2.replaceAll("A", "\uD835\uDE08");
        strImport2 = strImport2.replaceAll("B", "\uD835\uDE09");
        strImport2 = strImport2.replaceAll("C", "\uD835\uDE0A");
        strImport2 = strImport2.replaceAll("D", "\uD835\uDE0B");
        strImport2 = strImport2.replaceAll("E", "\uD835\uDE0C");
        strImport2 = strImport2.replaceAll("F", "\uD835\uDE0D");
        strImport2 = strImport2.replaceAll("G", "\uD835\uDE0E");
        strImport2 = strImport2.replaceAll("H", "\uD835\uDE0F");
        strImport2 = strImport2.replaceAll("I", "\uD835\uDE10");
        strImport2 = strImport2.replaceAll("J", "\uD835\uDE11");
        strImport2 = strImport2.replaceAll("K", "\uD835\uDE12");
        strImport2 = strImport2.replaceAll("L", "\uD835\uDE13");
        strImport2 = strImport2.replaceAll("M", "\uD835\uDE14");
        strImport2 = strImport2.replaceAll("N", "\uD835\uDE15");
        strImport2 = strImport2.replaceAll("O", "\uD835\uDE16");
        strImport2 = strImport2.replaceAll("P", "\uD835\uDE17");
        strImport2 = strImport2.replaceAll("Q", "\uD835\uDE18");
        strImport2 = strImport2.replaceAll("R", "\uD835\uDE19");
        strImport2 = strImport2.replaceAll("S", "\uD835\uDE1A");
        strImport2 = strImport2.replaceAll("T", "\uD835\uDE1B");
        strImport2 = strImport2.replaceAll("U", "\uD835\uDE1C");
        strImport2 = strImport2.replaceAll("V", "\uD835\uDE1D");
        strImport2 = strImport2.replaceAll("W", "\uD835\uDE1E");
        strImport2 = strImport2.replaceAll("X", "\uD835\uDE1F");
        strImport2 = strImport2.replaceAll("Y", "\uD835\uDE20");
        strImport2 = strImport2.replaceAll("Z", "\uD835\uDE21");

        // Small abc
       //  𝘢 𝘣 𝘤 𝘥 𝘦 𝘧 𝘨 𝘩 𝘪 𝘫 𝘬 𝘭 𝘮 𝘯 𝘰 𝘱 𝘲 𝘳 𝘴 𝘵 𝘶 𝘷 𝘸 𝘹 𝘺 𝘻


        strImport2 = strImport2.replaceAll("a", "\uD835\uDE22");
        strImport2 = strImport2.replaceAll("b", "\uD835\uDE23");
        strImport2 = strImport2.replaceAll("c", "\uD835\uDE24");
        strImport2 = strImport2.replaceAll("d", "\uD835\uDE25");
        strImport2 = strImport2.replaceAll("e", "\uD835\uDE26");
        strImport2 = strImport2.replaceAll("f", "\uD835\uDE27");
        strImport2 = strImport2.replaceAll("g", "\uD835\uDE28");
        strImport2 = strImport2.replaceAll("h", "\uD835\uDE29");
        strImport2 = strImport2.replaceAll("i", "\uD835\uDE2A");
        strImport2 = strImport2.replaceAll("j", "\uD835\uDE2B");
        strImport2 = strImport2.replaceAll("k", "\uD835\uDE2C");
        strImport2 = strImport2.replaceAll("l", "\uD835\uDE2D");
        strImport2 = strImport2.replaceAll("m", "\uD835\uDE2E");
        strImport2 = strImport2.replaceAll("n", "\uD835\uDE2F");
        strImport2 = strImport2.replaceAll("o", "\uD835\uDE30");
        strImport2 = strImport2.replaceAll("p", "\uD835\uDE31");
        strImport2 = strImport2.replaceAll("q", "\uD835\uDE32");
        strImport2 = strImport2.replaceAll("r", "\uD835\uDE33");
        strImport2 = strImport2.replaceAll("s", "\uD835\uDE34");
        strImport2 = strImport2.replaceAll("t", "\uD835\uDE35");
        strImport2 = strImport2.replaceAll("u", "\uD835\uDE36");
        strImport2 = strImport2.replaceAll("v", "\uD835\uDE37");
        strImport2 = strImport2.replaceAll("w", "\uD835\uDE38");
        strImport2 = strImport2.replaceAll("x", "\uD835\uDE39");
        strImport2 = strImport2.replaceAll("y", "\uD835\uDE3A");
        strImport2 = strImport2.replaceAll("z", "\uD835\uDE3B");

        et_Main.setText(strImport2);
    }

    public void buttonStyle3(){

        if (et_Main.getText().toString().matches(".*[a-z].*") || (et_Main.getText().toString().matches(".*[A-Z].*"))) {
            original_text= et_Main.getText().toString();
        }


    }



}