package com.gradle.graphqltest.mutation

import com.gradle.graphqltest.query.PostDto
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class MutationResolver {

    @MutationMapping
    fun createPost(@Argument title: String, @Argument description: String?): PostDto {
        return PostDto(
            id = UUID.randomUUID(),
            title = title,
            description = description
        )
    }
}