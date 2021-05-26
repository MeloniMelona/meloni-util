package kr.co.meloni.util;

import kr.co.meloni.util.pagination.Pagination;
import kr.co.meloni.util.pagination.Pagination.PageObject;

public class Main {

    public static void main(String[] args) {
    }

    @SuppressWarnings("unused")
    private static void testPagination() {
        PageObject pageObject = Pagination.paginate(1, 10, 10, 10000);
        StringBuilder sb = new StringBuilder();
        sb.append("page : " + pageObject.getPage() + "\n");
        sb.append("rowSize : " + pageObject.getRowSize() + "\n");
        sb.append("pageSize : " + pageObject.getPageSize() + "\n");
        sb.append("totalCount : " + pageObject.getTotalCount() + "\n");
        sb.append("pageCount : " + pageObject.getPageCount() + "\n");
        sb.append("rowStart : " + pageObject.getRowStart() + "\n");
        sb.append("rowEnd : " + pageObject.getRowEnd() + "\n");
        sb.append("pagePosition : " + pageObject.getPagePosition() + "\n");
        sb.append("pageStart : " + pageObject.getPageStart() + "\n");
        sb.append("pageEnd : " + pageObject.getPageEnd() + "\n");
        System.out.println(sb.toString());
    }

}
