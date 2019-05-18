package ru.myfirstwebsite.controller.requests;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class SearchCriteria {
    private String query;
    private Integer limit;
    private Integer offset;

    public SearchCriteria() {
    }

    public SearchCriteria(String query, Integer limit, Integer offset) {
        this.query = query;
        this.limit = limit;
        this.offset = offset;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCriteria that = (SearchCriteria) o;
        return Objects.equals(getQuery(), that.getQuery()) &&
                Objects.equals(getLimit(), that.getLimit()) &&
                Objects.equals(getOffset(), that.getOffset());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuery(), getLimit(), getOffset());
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
