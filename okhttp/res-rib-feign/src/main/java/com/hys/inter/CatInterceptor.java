package com.hys.inter;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CatInterceptor implements Interceptor{

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
		RequestBody requestBody = request.body();
		boolean hasRequestBody = requestBody != null;
		return null;
	}

}
