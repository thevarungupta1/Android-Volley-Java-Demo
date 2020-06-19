package com.thevarungupta.volleydemowithjava.app;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.thevarungupta.volleydemowithjava.utils.LruBitmapCache;

public class MyApplication extends Application {

    private static final String TAG = "myTag";

    private RequestQueue mRequestQueue;
    private static MyApplication mInstance;
    private  ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static synchronized MyApplication getInstance(){
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        if(mRequestQueue == null){
            mRequestQueue = Volley.newRequestQueue(this);
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request){
        getRequestQueue().add(request);
    }

    public <T> void addToRequestQueue(Request<T> request, String tag){
        request.setTag(TextUtils.isEmpty(tag)? TAG: tag);
        getRequestQueue().add(request);
    }

    public  void cancelPendingRequest(Object tag){
        if(mRequestQueue!=null){
            mRequestQueue.cancelAll(tag);
        }
    }

    public ImageLoader getImageLoader(){
        getRequestQueue();
        if(imageLoader == null){
            imageLoader = new ImageLoader(this.mRequestQueue, new LruBitmapCache());
        }
        return imageLoader;
    }
}
