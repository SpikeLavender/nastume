package com.natsume.service;

import com.github.pagehelper.PageInfo;
import com.natsume.form.SearchForm;
import com.natsume.vo.ProductDetailVo;
import com.natsume.vo.ResponseVo;


public interface ProductService {

	ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

	ResponseVo<ProductDetailVo> detail(Integer productId);

    ResponseVo<PageInfo> search(SearchForm searchForm, Integer pageNum, Integer pageSize);

}
