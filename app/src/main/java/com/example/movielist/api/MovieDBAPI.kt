package com.example.movielist.api

import com.example.movielist.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Headers
import retrofit2.http.Path

interface MovieDBAPI {
    @GET("/3/account/{account_id}/lists")
    @Headers("Authorization: 9900a9720d31dfd5fdb4352700c")

    suspend fun movieList(
        @Path("account_id") accountId:String,
        @Query("page") searchQuery: Int
    ) : Response<MovieResponse>
}