<#import "parts/common.ftl" as c>

<@c.page>
<div>
    <form method="post" action="/employee/add">
        <input type="text" name="firstName" placeholder="First Name">
        <input type="text" name="lastName" placeholder="Last Name">
        <button class="btn btn-dark" type="submit">Submit</button>
    </form>
    <form method="get" action="/employee">
        <input type="text" name="firstName" placeholder="Filter" value="${firstname}">
        <button class="btn btn-dark" type="submit">Filter</button>
    </form>
</div>
<div>
    <table class="table">
        <thead>
        <tr>
            <th> First Name</th>
            <th> Last Name</th>
        </tr>
        </thead>
        <tbody>
        <#list employees as employee>
        <div>
            <tr>
                <td><span>${employee.firstName}</span></td>
                <td><span>${employee.lastName}</span></td>
            </tr>
        </div>
        <#else>
        No Message
        </#list>
        </tbody>
    </table>
</div>
</@c.page>