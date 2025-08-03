import React from 'react';

class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            posts: []
          };
    }

    loadPosts(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(response => response.json())
        .then(data => {
            this.setState({ posts: data });
        })
        .catch(error => {
            console.error("Error fetching posts:", error);
        });
    }

    componentDidMount(){
        this.loadPosts();
    }

    componentDidCatch(error, info){
        alert("An error occurred while loading the posts: " + error);
    }

    render(){
        return (
            <div>
                <h1>All Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;