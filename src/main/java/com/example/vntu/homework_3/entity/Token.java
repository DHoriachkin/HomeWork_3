package com.example.vntu.homework_3.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token {
    private String userName;
    private String authValue;
    private Long tokenId;
    private String destinationService;
    private String issueDate;

    public String getUserName() {
        return userName;
    }

    public String getAuthValue() {
        return authValue;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDestinationService() {
        return destinationService;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setDestinationService(String destinationService) {
        this.destinationService = destinationService;
    }

    public static Builder builder() {
        return new Token().new Builder();
    }

    public final class Builder {

        public Builder userName(String userName) {
            Token.this.setUserName(userName);
            return this;
        }

        public Builder authValue(String authValue) {
            Token.this.setAuthValue(authValue);
            return this;
        }

        public Builder tokenId(Long tokenId) {
            Token.this.setTokenId(tokenId);
            return this;
        }

        public Builder issueDate(String issueDate) {
            Token.this.setIssueDate(issueDate);
            return this;
        }

        public Builder destinationService(String destinationService) {
            Token.this.setDestinationService(destinationService);
            return this;
        }

        public Token build() {
            return Token.this;
        }
    }
}