package de.jetwick.snacktory;

import java.io.InputStream;

public class FetchResult {

    private String url;
    private InputStream pageInputStream;
    private String contentType;
    private String htmlAsString;
    
    public FetchResult(){
        
    }
    
    public FetchResult(String url, InputStream pageInputStream, String contentType,String res) {
        this.url = url;
        this.pageInputStream = pageInputStream;
        this.contentType = contentType;
        this.htmlAsString = res;
    }
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public InputStream getPageInputStream() {
        return pageInputStream;
    }
    public void setPageInputStream(InputStream pageInputStream) {
        this.pageInputStream = pageInputStream;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getHtmlAsString() {
        return htmlAsString;
    }

    public void setHtmlAsString(String htmlAsString) {
        this.htmlAsString = htmlAsString;
    }
    
}
