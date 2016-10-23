package com.example.model;

import java.util.Collection;

public class JsonCollectionModel<T> {
	Collection<T> content;

	public Collection<T> getContent() {
		return content;
	}

	public void setContent(Collection<T> content) {
		this.content = content;
	}
}
