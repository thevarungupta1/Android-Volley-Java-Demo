package com.thevarungupta.volleydemowithjava.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thevarungupta.volleydemowithjava.R;
import com.thevarungupta.volleydemowithjava.adapters.AdapterProduct;
import com.thevarungupta.volleydemowithjava.app.Endpoints;
import com.thevarungupta.volleydemowithjava.app.MyApplication;
import com.thevarungupta.volleydemowithjava.models.Product;
import com.thevarungupta.volleydemowithjava.models.ProductResponse;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Product> mList = new ArrayList();
    private AdapterProduct adapterProduct;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        getData();
        progressBar = findViewById(R.id.progress_bar);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterProduct = new AdapterProduct(this);
        recyclerView.setAdapter(adapterProduct);

    }

    private void getData(){
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                Endpoints.getProducts(),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        progressBar.setVisibility(View.GONE);
                        Gson gson = new GsonBuilder().create();
                        ProductResponse productResponse = gson.fromJson(response.toString(), ProductResponse.class);
                        adapterProduct.setData(productResponse.data);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("myTag", error.getMessage());
                    }
                }
        );
        MyApplication.getInstance().addToRequestQueue(request);
    }
}
