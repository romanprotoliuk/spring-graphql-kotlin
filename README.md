# Spring GraphQL with Kotlin Template
## Spring GraphQL with Kotlin

Welcome to the Spring GraphQL with Kotlin template! This template provides a solid foundation for building GraphQL APIs using the Spring framework with Kotlin. Whether you're a seasoned developer or just starting with GraphQL and Kotlin, this project will help you kickstart your development process.

### Introduction
GraphQL is a powerful query language that allows you to request only the data you need, making it more efficient and flexible than traditional REST APIs. This template integrates Spring Boot with Kotlin, providing a reliable and efficient foundation for building GraphQL APIs.

### Features
**GraphQL Schema**: The project comes with a well-defined GraphQL schema that includes types for querying posts and creating new posts.

**Query and Mutation Resolvers**: The template includes example implementations of resolvers for queries and mutations. The QueryResolver.kt handles fetching posts, and the MutationResolver.kt handles creating new posts.

**Static Data**: The example resolvers use static data to demonstrate the basic functionality. You can easily replace it with your data access mechanisms, such as databases or external APIs.

**Customizable**: The template is designed to be easily extensible and customizable. You can add additional resolvers, data fetchers, or authentication mechanisms to suit your project requirements.

### GraphQL Schema
The GraphQL schema defines the structure and operations available in your GraphQL API. In this project, the schema consists of three types: Query, Mutation, and Post.

``` 
type Query {
    getPosts: [Post]!
    recentPosts(limit: Int!, offset: Int): [Post]!
} 
```
```
type Mutation {
    createPost(
    title: String!,
    description: String
  ): Post!
}
```

```
type Post {
    id: ID!
    title: String!
    description: String
}
```


### Getting Started
To get started with the project, follow these steps:

1. Clone the repository to your local machine:
```bash
git clone https://github.com/your-username/your-repo.git
````
2. Navigate to the project directory:

 ```bash 
 cd your-repo
```

3. Build the project:
```bash
./gradlew build
```

4. Run the application:
```bash
./gradlew bootRun
```

Now, your Spring GraphQL with Kotlin application is up and running!


### Examples
**Basic Query**

Let's explore a basic example of a GraphQL query using this template. Assume we have a Post type with id, title, and description fields.

```bash
query {
    getPosts {
      id
      title
      description
    }
}
```

This query will retrieve all posts available in the system and return their id, title, and description information.

**Mutation**

In this example, we will perform a mutation to create a new post using the following GraphQL mutation:

```bash
mutation {
    createPost(title: "New Post", description: "This is a new post.") {
      id
      title
      description
    }
}
```

This mutation will create a new post with the provided title and description, and return the newly created post's id, title, and description.