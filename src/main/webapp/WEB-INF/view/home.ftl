<#include "/common/head.ftl" >
<#include "/common/header.ftl">
<body>
<div class="container">
    <div id="banner" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
        <#list banners as banner>
            <li data-target="#banner" data-slide-to="${banner_index}" <#if banner_index == 0>class="active"</#if>>
            </li>
        </#list>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
        <#list banners as banner>
            <div class="item<#if banner_index == 0> active</#if>">
                <img src="${banner.url}" alt="..."/>

                <div class="carousel-caption">
                    ${banner.name}
                </div>
            </div>
        </#list>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#banner" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#banner" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">今日推荐</div>
        <div class="panel-body">
            <img src="${today.url}" class="img-responsive">
        </div>
    </div>

    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">明日预告</h3>
        </div>
        <div class="panel-body">
            <img src="${tomorrow.url}" class="img-responsive">
        </div>
    </div>
</div>
<#include "/common/footer.ftl">