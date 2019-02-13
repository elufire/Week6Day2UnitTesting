package com.example.week6day2unittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.flurry.android.FlurryAgent;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView tvPay;
    TextView tvName;
    TextView tvAddress;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .build(this, "HRBBPH6TZGFN9TCRW5ZQ");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        tvPay = findViewById(R.id.tvPay);
        tvName = findViewById(R.id.tvName);
        tvAddress = findViewById(R.id.tvAddress);
    }

    public void onClick(View view) {
        Address adress = new Address("1500 Montwood", "Marietta", "Ga",
                "30067", "USA");
        Name name = new Name("Ricky", "Enrique",
                "Bojorquez", "Dr");
        TimeSheet timeSheet = new TimeSheet((float)7.00, true, (float)40.00);
        Employee employee = new Employee(name, adress, timeSheet);
        CalculatePayroll calculatePayroll = new CalculatePayroll(employee);

        HashMap<String, String> displayMap = calculatePayroll.toHashMap();
        tvPay.setText(displayMap.get("pay"));
        tvName.setText(displayMap.get("name"));
        tvAddress.setText(displayMap.get("address"));

        Bundle params = new Bundle();
        params.putString("image_name", displayMap.get("name"));
        params.putString("pay", displayMap.get("pay"));
        mFirebaseAnalytics.logEvent("employee_payroll", params);
        FlurryAgent.logEvent("Button-Clicked");
    }
}
