package com.fdmgroup.cataloguetest.mockito;

import java.util.List;

public interface ReadItemCommand {

	List<Book> ReadAll(List<Book> bookList2);
}
