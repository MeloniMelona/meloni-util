package kr.co.meloni.util.pagination;

public class Pagination {

    private Pagination() {}

    public static PageObject paginate(
            long page,
            long rowSize,
            long pageSize,
            long totalCount) {
        page = page > 0 ? page : 1;
        rowSize = rowSize > 0 ? rowSize : 10;
        pageSize = pageSize > 0 ? pageSize : 10;
        long pageCount = (totalCount % rowSize) == 0 ? (totalCount / rowSize) : (totalCount / rowSize) + 1;
        long rowStart = page > 0 ? (page * rowSize) - rowSize + 1 : 1;
        long rowEnd = page > 0 ? (page * rowSize) : rowSize; rowEnd = totalCount > rowEnd ? rowEnd : totalCount;
        long pagePosition = (page % pageSize) == 0 ? (page / pageSize) : (page / pageSize) + 1;
        long pageStart = (pagePosition * pageSize) + 1 - pageSize;
        long pageEnd = (pagePosition * pageSize); pageEnd = pageCount > pageEnd ? pageEnd : pageCount;
        boolean hasPrevious = pagePosition > 1;
        boolean hasNext = pagePosition < (pageCount % pageSize == 0 ? (pageCount / pageSize) : (pageCount / pageSize) + 1);
        PageObject pageObject = new PageObject();
        pageObject.setPage(page);
        pageObject.setRowSize(rowSize);
        pageObject.setPageSize(pageSize);
        pageObject.setTotalCount(totalCount);
        pageObject.setPageCount(pageCount);
        pageObject.setRowStart(rowStart);
        pageObject.setRowEnd(rowEnd);
        pageObject.setPagePosition(pagePosition);
        pageObject.setPageStart(pageStart);
        pageObject.setPageEnd(pageEnd);
        pageObject.setHasPrevious(hasPrevious);
        pageObject.setHasNext(hasNext);
        return pageObject;
    }

    public static class PageObject {

        private PageObject() {}

        private long page;

        private long rowSize;

        private long pageSize;

        private long totalCount;

        private long pageCount;

        private long rowStart;

        private long rowEnd;

        private long pagePosition;

        private long pageStart;

        private long pageEnd;

        private boolean hasPrevious;

        private boolean hasNext;

        public long getPage() {
            return page;
        }

        private void setPage(long page) {
            this.page = page;
        }

        public long getRowSize() {
            return rowSize;
        }

        private void setRowSize(long rowSize) {
            this.rowSize = rowSize;
        }

        public long getPageSize() {
            return pageSize;
        }

        private void setPageSize(long pageSize) {
            this.pageSize = pageSize;
        }

        public long getTotalCount() {
            return totalCount;
        }

        private void setTotalCount(long totalCount) {
            this.totalCount = totalCount;
        }

        public long getPageCount() {
            return pageCount;
        }

        private void setPageCount(long pageCount) {
            this.pageCount = pageCount;
        }

        public long getRowStart() {
            return rowStart;
        }

        private void setRowStart(long rowStart) {
            this.rowStart = rowStart;
        }

        public long getRowEnd() {
            return rowEnd;
        }

        private void setRowEnd(long rowEnd) {
            this.rowEnd = rowEnd;
        }

        public long getPagePosition() {
            return pagePosition;
        }

        private void setPagePosition(long pagePosition) {
            this.pagePosition = pagePosition;
        }

        public long getPageStart() {
            return pageStart;
        }

        private void setPageStart(long pageStart) {
            this.pageStart = pageStart;
        }

        public long getPageEnd() {
            return pageEnd;
        }

        private void setPageEnd(long pageEnd) {
            this.pageEnd = pageEnd;
        }

        public boolean getHasPrevious() {
            return hasPrevious;
        }

        private void setHasPrevious(boolean hasPrevious) {
            this.hasPrevious = hasPrevious;
        }

        public boolean getHasNext() {
            return hasNext;
        }

        private void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

    }

}
