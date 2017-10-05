package com.practicaleducationnetwork.pen.UserRegistration;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.practicaleducationnetwork.pen.R;

public class dataSave extends Activity {
    private Button buttonSave;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;
    private EditText fullname,phoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_save);

        buttonSave=(Button) findViewById(R.id.buttonSave);
        databaseReference= FirebaseDatabase.getInstance().getReference();
        firebaseAuth=FirebaseAuth.getInstance();
        fullname=(EditText) findViewById(R.id.fullname);
        phoneNumber=(EditText) findViewById(R.id.phoneNumber);



        buttonSave.setOnClickListener(new View.OnClickListener() {

public void saveInfo(){
    String userID=fullname.getText().toString().trim();
    String ph=phoneNumber.getText().toString().trim();




    if(TextUtils.isEmpty(userID)){
        Toast.makeText(dataSave.this,"Please enter fullname", Toast.LENGTH_SHORT).show();
    }

    if(TextUtils.isEmpty(ph)){

        Toast.makeText(dataSave.this,"Please enter phone number",Toast.LENGTH_SHORT).show();
    }

    else {

        userInformation userInformation=new userInformation(userID,ph);
        FirebaseUser user=firebaseAuth.getCurrentUser();
        databaseReference.child(user.getUid()).setValue(userInformation);
        Toast.makeText(dataSave.this,"Submitted",Toast.LENGTH_LONG).show();


    }




}
            @Override
            public void onClick(View view) {
                saveInfo();
            }
        });
    }
}
