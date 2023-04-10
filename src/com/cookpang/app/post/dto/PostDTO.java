package com.cookpang.app.post.dto;



public class PostDTO {
    private int postNumber;
    private String postTitle;
    private String postContent;
    private String postRecipeContent;
    private String postDate;
    private int postViewCount;
    private int userNumber;
    
    
    public PostDTO() {}

	@Override
	public String toString() {
		return "PostDTO [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postRecipeContent=" + postRecipeContent + ", postDate=" + postDate + ", postViewCount="
				+ postViewCount + ", userNumber=" + userNumber + "]";
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostRecipeContent() {
		return postRecipeContent;
	}

	public void setPostRecipeContent(String postRecipeContent) {
		this.postRecipeContent = postRecipeContent;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public int getPostViewCount() {
		return postViewCount;
	}

	public void setPostViewCount(int postViewCount) {
		this.postViewCount = postViewCount;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

}