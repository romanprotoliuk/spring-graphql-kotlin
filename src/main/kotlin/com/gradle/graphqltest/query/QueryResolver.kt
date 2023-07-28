package com.gradle.graphqltest.query

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class QueryResolver {

    @QueryMapping
    fun getPosts(): List<PostDto> {
        return listOf(
            PostDto(
                id = UUID.randomUUID(),
                title = "Test Title",
                description = "test description"
            ),
        )
    }

    @QueryMapping
    fun recentPosts(@Argument limit: Int, @Argument offset: Int): List<PostDto> {
        return listOf(
            PostDto(
                id = UUID.randomUUID(),
                title = "Test Title",
                description = "test description"
            ),
            PostDto(
                id = UUID.randomUUID(),
                title = "Test Title2",
                description = "test description2"
            ),
        )
    }
}

data class PostDto(
    val id: UUID,
    val title: String,
    val description: String? = null
)