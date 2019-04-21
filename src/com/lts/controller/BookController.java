package com.lts.controller;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lts.pojo.Author;
import com.lts.pojo.Book;
import com.lts.pojo.Borrow;
import com.lts.pojo.Librarian;
import com.lts.pojo.Message;
import com.lts.pojo.Reader;
import com.lts.service.AuthorService;
import com.lts.service.BookService;
import com.lts.service.BorrowService;
import com.lts.service.LibrarianService;
import com.lts.service.ReaderService;

@Controller
@RequestMapping("")
public class BookController {

	@Autowired
	BookService bookService;
	@Autowired
	LibrarianService librarianService;
	@Autowired
	ReaderService readerService;
	@Autowired
	BorrowService borrowService;
	@Autowired
	AuthorService authorService;

	@RequestMapping("listBook")
	public ModelAndView listBook(){
		ModelAndView mav = new ModelAndView();
		List<Book> book= bookService.list();
		mav.addObject("book", book);
		mav.setViewName("listBook");
		return mav;
	}
	
	@RequestMapping("listLibrarian")
	public ModelAndView listLibrarian(){
		ModelAndView mav = new ModelAndView();
		List<Librarian> librarian= librarianService.list();
		mav.addObject("librarian", librarian);
		mav.setViewName("listLibrarian");
		return mav;
	}
	
	@RequestMapping("listReader")
	public ModelAndView listReader(){
		ModelAndView mav = new ModelAndView();
		List<Reader> reader= readerService.list();
		mav.addObject("reader", reader);
		mav.setViewName("listReader");
		return mav;
	}
	
	@RequestMapping("listBorrow")
	public ModelAndView listBorrow(){
		ModelAndView mav = new ModelAndView();
		List<Borrow> borrow= borrowService.list();
		mav.addObject("borrow", borrow);
		mav.setViewName("listBorrow");
		return mav;
	}
	
	@RequestMapping("addBook")
    public ModelAndView addBook(Book book) throws Exception {
        JSONObject json = JSONObject.fromObject(book);
        
        String b_id = json.getString("b_id");
        List<Book> booklist = bookService.list();
        for(int i=0;i<booklist.size();i++) {
        	if(b_id.equals(booklist.get(i).getB_id())) {
        		ModelAndView mav = new ModelAndView("fail");
        		Message msg=new Message();
        		msg.setMsg("您要添加的书籍已存在，请检查书籍的ID是否填写正确");
        		mav.addObject("msg", msg);
            	return mav;
        	}
        }
        String b_name = json.getString("b_name");
        String b_publisher = json.getString("b_publisher");
        int b_amount = json.getInt("b_amount");
        String b_location = json.getString("b_location");
        String l_id = json.getString("l_id");
        
        Book book_ = new Book();
        book_.setB_id(b_id);
        book_.setB_name(b_name);
        book_.setB_publisher(b_publisher);
        book_.setB_amount(b_amount);
        book_.setB_location(b_location);
        book_.setL_id(l_id);
        int sig=bookService.add(book_);
        ModelAndView mav = new ModelAndView("showBook");
        return mav;
    }
	
	@RequestMapping("addLibrarian")
    public ModelAndView addLibrarian(Librarian librarian) throws Exception {
        JSONObject json = JSONObject.fromObject(librarian);
        
        String l_id = json.getString("l_id");
        List<Librarian> librarianlist = librarianService.list();
        for(int i=0;i<librarianlist.size();i++) {
        	if(l_id.equals(librarianlist.get(i).getL_id())) {
        		ModelAndView mav = new ModelAndView("fail");
        		Message msg=new Message();
        		msg.setMsg("您要添加的管理员已存在，请检查管理员的ID是否填写正确");
        		mav.addObject("msg", msg);
            	return mav;
        	}
        }
        String l_name = json.getString("l_name");
        String l_sex = json.getString("l_sex");
        
        Librarian librarian_ = new Librarian();
        librarian_.setL_id(l_id);
        librarian_.setL_sex(l_sex);
        librarian_.setL_name(l_name);
        
        int sig=librarianService.add(librarian_);
        ModelAndView mav = new ModelAndView("showLibrarian");
        return mav;
    }
	
	@RequestMapping("addReader")
    public ModelAndView addReader(Reader reader) throws Exception {
        JSONObject json = JSONObject.fromObject(reader);
        
        String r_id = json.getString("r_id");
        List<Reader> readerlist = readerService.list();
        for(int i=0;i<readerlist.size();i++) {
        	if(r_id.equals(readerlist.get(i).getR_id())) {
        		ModelAndView mav = new ModelAndView("fail");
        		Message msg=new Message();
        		msg.setMsg("您要添加的读者已存在，请检查管理员的ID是否填写正确");
        		mav.addObject("msg", msg);
            	return mav;
        	}
        }
        String r_name = json.getString("r_name");
        String r_sex = json.getString("r_sex");
        String r_tel = json.getString("r_tel");
        
        Reader reader_ = new Reader();
        reader_.setR_id(r_id);
        reader_.setR_sex(r_sex);
        reader_.setR_name(r_name);
        reader_.setR_tel(r_tel);
        
        int sig=readerService.add(reader_);
        ModelAndView mav = new ModelAndView("showReader");
        return mav;
    }
	
	@RequestMapping("addBorrow")
    public ModelAndView addBorrow(Borrow borrow) throws Exception {
        JSONObject json = JSONObject.fromObject(borrow);
        
        String r_id = json.getString("r_id");
        String b_id = json.getString("b_id");
        
        List<Borrow> borrowlist = borrowService.list();
        for(int i=0;i<borrowlist.size();i++) {
        	if(r_id.equals(borrowlist.get(i).getR_id())&&b_id.equals(borrowlist.get(i).getB_id())) {
        		ModelAndView mav = new ModelAndView("fail");
        		Message msg=new Message();
        		msg.setMsg("该读者已借阅这本书，请检查书籍和读者的ID是否填写正确");
        		mav.addObject("msg", msg);
            	return mav;
        	}
        }
        String borrow_date = json.getString("borrow_date");
        String return_date = json.getString("return_date");
        
        Borrow borrow_ = new Borrow();
        borrow_.setR_id(r_id);
        borrow_.setB_id(b_id);
        borrow_.setBorrow_date(borrow_date);
        borrow_.setReturn_date(return_date);
        
        int sig=borrowService.add(borrow_);
        ModelAndView mav = new ModelAndView("showBorrow");
        return mav;
    }
	
	@RequestMapping("addAuthor")
    public ModelAndView addAuthor(Author author) throws Exception {
        JSONObject json = JSONObject.fromObject(author);
        
        String b_id = json.getString("b_id");
        String author_ = json.getString("author");
        
        List<Author> authorlist = authorService.list();
        for(int i=0;i<authorlist.size();i++) {
        	if(b_id.equals(authorlist.get(i).getB_id())&&author_.equals(authorlist.get(i).getAuthor())) {
        		ModelAndView mav = new ModelAndView("fail");
        		Message msg=new Message();
        		msg.setMsg("添加的作者信息已存在");
        		mav.addObject("msg", msg);
            	return mav;
        	}
        }
        Boolean sig1=false;
        List<Book> bl=bookService.list();
        for(int i=0;i<bl.size();i++) {
        	if(b_id.equals(bl.get(i).getB_id())) {
        		sig1=true;
        	}
        }
        if(sig1==false) {
        	ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("添加的作者所对应的书籍不存在");
    		mav.addObject("msg", msg);
        	return mav;
        }
        Author author1 = new Author();
        author1.setAuthor(author_);
        author1.setB_id(b_id);
        
        int sig=authorService.add(author1);
        ModelAndView mav = new ModelAndView("showAuthor");
        mav.addObject("author",author1);
        return mav;
    }
	
	@RequestMapping("updateBook")
    public ModelAndView updateBook(Book book) throws Exception {
        JSONObject json = JSONObject.fromObject(book);
        
        String b_id = json.getString("b_id");
        Boolean flag=false;
        List<Book> booklist = bookService.list();
        for(int i=0;i<booklist.size();i++) {
        	if(b_id.equals(booklist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您修改的书籍不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        String b_name = json.getString("b_name");
        String b_publisher = json.getString("b_publisher");
        int b_amount = json.getInt("b_amount");
        String b_location = json.getString("b_location");
        String l_id = json.getString("l_id");
        
        Book book_ = new Book();
        book_.setB_id(b_id);
        book_.setB_name(b_name);
        book_.setB_publisher(b_publisher);
        book_.setB_amount(b_amount);
        book_.setB_location(b_location);
        book_.setL_id(l_id);
        int sig=bookService.update(book_);
        ModelAndView mav = new ModelAndView("showBook");
        return mav;
    }
	
	@RequestMapping("updateLibrarian")
    public ModelAndView updateLibrarian(Librarian librarian) throws Exception {
        JSONObject json = JSONObject.fromObject(librarian);
        
        String l_id = json.getString("l_id");
        Boolean flag=false;
        List<Librarian> librarianlist = librarianService.list();
        for(int i=0;i<librarianlist.size();i++) {
        	if(l_id.equals(librarianlist.get(i).getL_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您修改的管理员不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        String l_name = json.getString("l_name");
        String l_sex = json.getString("l_sex");
        
        Librarian librarian_ = new Librarian();
        librarian_.setL_id(l_id);
        librarian_.setL_sex(l_sex);
        librarian_.setL_name(l_name);
        
        int sig=librarianService.update(librarian_);
        ModelAndView mav = new ModelAndView("showLibrarian");
        return mav;
    }
	
	@RequestMapping("updateReader")
    public ModelAndView updateReader(Reader reader) throws Exception {
        JSONObject json = JSONObject.fromObject(reader);
        
        String r_id = json.getString("r_id");
        Boolean flag=false;
        List<Reader> readerlist = readerService.list();
        for(int i=0;i<readerlist.size();i++) {
        	if(r_id.equals(readerlist.get(i).getR_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您修改的读者不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        String r_name = json.getString("r_name");
        String r_sex = json.getString("r_sex");
        String r_tel = json.getString("r_tel");
        
        Reader reader_ = new Reader();
        reader_.setR_id(r_id);
        reader_.setR_sex(r_sex);
        reader_.setR_name(r_name);
        reader_.setR_tel(r_tel);
        
        int sig=readerService.update(reader_);
        ModelAndView mav = new ModelAndView("showReader");
        return mav;
    }
	
	@RequestMapping("updateBorrow")
    public ModelAndView updateBorrow(Borrow borrow) throws Exception {
        JSONObject json = JSONObject.fromObject(borrow);
        
        String r_id = json.getString("r_id");
        String b_id = json.getString("b_id");
        
        Boolean flag=false;
        List<Borrow> borrowlist = borrowService.list();
        for(int i=0;i<borrowlist.size();i++) {
        	if(r_id.equals(borrowlist.get(i).getR_id())&&b_id.equals(borrowlist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您修改的借阅信息不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        String borrow_date = json.getString("borrow_date");
        String return_date = json.getString("return_date");
        
        Borrow borrow_ = new Borrow();
        borrow_.setR_id(r_id);
        borrow_.setB_id(b_id);
        borrow_.setBorrow_date(borrow_date);
        borrow_.setReturn_date(return_date);
        
        int sig=borrowService.update(borrow_);
        ModelAndView mav = new ModelAndView("showBorrow");
        return mav;
    }
	
	@RequestMapping("deleteBook")
    public ModelAndView deleteBook(Book book) throws Exception {
        JSONObject json = JSONObject.fromObject(book);
        
        String b_id = json.getString("b_id");
        Boolean flag=false;
        List<Book> booklist = bookService.list();
        for(int i=0;i<booklist.size();i++) {
        	if(b_id.equals(booklist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您删除的书籍不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        bookService.delete(b_id);
        ModelAndView mav = new ModelAndView("listBook");
        List<Book> booklist_= bookService.list();
		mav.addObject("book", booklist_);
        return mav;
    }
	
	@RequestMapping("deleteLibrarian")
    public ModelAndView deleteLibrarian(Librarian librarian) throws Exception {
        JSONObject json = JSONObject.fromObject(librarian);
        
        String l_id = json.getString("l_id");
        Boolean flag=false;
        List<Librarian> librarianlist = librarianService.list();
        for(int i=0;i<librarianlist.size();i++) {
        	if(l_id.equals(librarianlist.get(i).getL_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您删除的管理员不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        librarianService.delete(l_id);
        ModelAndView mav = new ModelAndView("listLibrarian");
        List<Librarian> librarianlist_= librarianService.list();
		mav.addObject("librarian", librarianlist_);
        return mav;
    }
	
	@RequestMapping("deleteReader")
    public ModelAndView deleteReader(Reader reader) throws Exception {
        JSONObject json = JSONObject.fromObject(reader);
        
        String r_id = json.getString("r_id");
        Boolean flag=false;
        List<Reader> readerlist = readerService.list();
        for(int i=0;i<readerlist.size();i++) {
        	if(r_id.equals(readerlist.get(i).getR_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您删除的读者不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        readerService.delete(r_id);
        ModelAndView mav = new ModelAndView("listReader");
        List<Reader> readerlist_= readerService.list();
		mav.addObject("reader", readerlist_);
        return mav;
    }
	
	@RequestMapping("deleteBorrow")
    public ModelAndView deleteBorrow(Borrow borrow) throws Exception {
        JSONObject json = JSONObject.fromObject(borrow);
        
        String r_id = json.getString("r_id");
        String b_id = json.getString("b_id");
        
        Boolean flag=false;
        List<Borrow> borrowlist = borrowService.list();
        for(int i=0;i<borrowlist.size();i++) {
        	if(r_id.equals(borrowlist.get(i).getR_id())&&b_id.equals(borrowlist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您删除的借阅信息不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        borrowService.delete(r_id,b_id);
        ModelAndView mav = new ModelAndView("listBorrow");
        List<Borrow> borrowlist_= borrowService.list();
		mav.addObject("borrow", borrowlist_);
        return mav;
    }
	
	@RequestMapping("deleteAuthor")
    public ModelAndView deleteAuthor(Author author) throws Exception {
        JSONObject json = JSONObject.fromObject(author);
        
        String b_id = json.getString("b_id");
        String author1 = json.getString("author");
        
        Boolean flag=false;
        List<Author> authorlist = authorService.list();
        for(int i=0;i<authorlist.size();i++) {
        	if(b_id.equals(authorlist.get(i).getB_id())&&author1.equals(authorlist.get(i).getAuthor())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您删除的作者信息不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        Author author2=new Author();
        author2.setAuthor(author1);
        author2.setB_id(b_id);
        authorService.delete(author2);
        ModelAndView mav = new ModelAndView("listAuthor");
        List<Author> authorlist_= authorService.search(b_id);
		mav.addObject("author", authorlist_);
        return mav;
    }
	
	@RequestMapping("searchBook")
    public ModelAndView searchBook(Book book) throws Exception {
        JSONObject json = JSONObject.fromObject(book);
        
        String b_id = json.getString("b_id");
        Boolean flag=false;
        List<Book> booklist = bookService.list();
        for(int i=0;i<booklist.size();i++) {
        	if(b_id.equals(booklist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您查询的书籍不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        Book book_= new Book();
        book_=bookService.search(b_id);
        ModelAndView mav = new ModelAndView("showBook");
        mav.addObject("book", book_);
        return mav;
    }
	
	@RequestMapping("searchLibrarian")
    public ModelAndView searchLibrarian(Librarian librarian) throws Exception {
        JSONObject json = JSONObject.fromObject(librarian);
        
        String l_id = json.getString("l_id");
        Boolean flag=false;
        List<Librarian> librarianlist = librarianService.list();
        for(int i=0;i<librarianlist.size();i++) {
        	if(l_id.equals(librarianlist.get(i).getL_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您查询的员工不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        Librarian librarian1= new Librarian();
        librarian1=librarianService.search(l_id);
        ModelAndView mav = new ModelAndView("showLibrarian");
        mav.addObject("librarian", librarian1);
        return mav;
    }
	
	@RequestMapping("searchReader")
    public ModelAndView searchReader(Reader reader) throws Exception {
        JSONObject json = JSONObject.fromObject(reader);
        
        String r_id = json.getString("r_id");
        System.out.println(r_id);
        Boolean flag=false;
        List<Reader> readerlist = readerService.list();
        for(int i=0;i<readerlist.size();i++) {
        	System.out.println(readerlist.get(i).getR_id());
        	if(r_id.equals(readerlist.get(i).getR_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您查询的读者不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        Reader reader1= new Reader();
        reader1=readerService.search(r_id);
        ModelAndView mav = new ModelAndView("showReader");
        mav.addObject("reader", reader1);
        return mav;
    }
	
	@RequestMapping("searchAuthor")
    public ModelAndView searchAuthor(Author author) throws Exception {
        JSONObject json = JSONObject.fromObject(author);
        
        String b_id = json.getString("b_id");
        
        Boolean flag=false;
        List<Author> authorlist = authorService.list();
        for(int i=0;i<authorlist.size();i++) {
        	if(b_id.equals(authorlist.get(i).getB_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您查询的书籍不存在");
    		mav.addObject("msg", msg);
    		return mav;
    	}
        
        List<Author> author1=authorService.search(b_id);
        ModelAndView mav = new ModelAndView("listAuthor");
        mav.addObject("author", author1);
        return mav;
    }
	
	@RequestMapping("searchBorrow")
    public ModelAndView searchBorrow(Borrow borrow) throws Exception {
        JSONObject json = JSONObject.fromObject(borrow);
        
        String r_id = json.getString("r_id");
        String b_id = json.getString("b_id");
        
        System.out.println(r_id+"_"+b_id);
        
        Boolean flag=false;
        List<Borrow> borrowlist = borrowService.list();
        for(int i=0;i<borrowlist.size();i++) {
        	if(b_id.equals(borrowlist.get(i).getB_id())&&r_id.equals(borrowlist.get(i).getR_id())) {
        		flag=true;
        	}
        }
        if(flag==false) {
    		ModelAndView mav = new ModelAndView("fail");
    		Message msg=new Message();
    		msg.setMsg("您输入的信息有误，请重新输入");
    		mav.addObject("msg", msg);
    		return mav;
    	}	
        List<Borrow> borrow1= borrowService.search(r_id, b_id);
        ModelAndView mav = new ModelAndView("listBorrow");
        mav.addObject("borrow", borrow1);
        return mav;
    }
    
}
