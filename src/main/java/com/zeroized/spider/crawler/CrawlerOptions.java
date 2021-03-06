package com.zeroized.spider.crawler;

import com.zeroized.spider.domain.Column;

import java.util.List;

/**
 * Created by Zero on 2018/3/22.
 */
public class CrawlerOptions {
    private List<String> allowDomains;
    private List<String> crawlUrlPrefixes;
    private List<Column> columns;

    public CrawlerOptions() {
    }

    public CrawlerOptions(List<String> allowDomains, List<String> crawlUrlPrefixes, List<Column> columns) {
        this.allowDomains = allowDomains;
        this.crawlUrlPrefixes = crawlUrlPrefixes;
        this.columns = columns;
    }

    public List<String> getAllowDomains() {
        return allowDomains;
    }

    public void setAllowDomains(List<String> allowDomains) {
        this.allowDomains = allowDomains;
    }

    public List<String> getCrawlUrlPrefixes() {
        return crawlUrlPrefixes;
    }

    public void setCrawlUrlPrefixes(List<String> crawlUrlPrefixes) {
        this.crawlUrlPrefixes = crawlUrlPrefixes;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "CrawlerOptions{" +
                "allowDomains=" + allowDomains.toString() +
                ", crawlUrlPrefixes=" + crawlUrlPrefixes.toString() +
                ", columns=" + columns.toString() +
                '}';
    }
}