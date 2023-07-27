
This repo contains java sources with prepared samples to try generation of unit tests by <b>alpha version</b> of 
<b>Didro</b>.

You are free to use these methods or modify them using supported Java structures or write your own code from scratch.
<u>These sources do not have any dependencies on any third-party code or build system.</u> You are free to use your 
favourite.

Before generation will be performed the plugin runs build to avoid passing not compilable code to the server, build 
should be successful.

<b>There is a requirement.</b> Module where you will perform unit test generation should have typical structure: java 
sources directory (<u>usually</u> '<b>main/java</b>') and test java sources directory (<u>usually</u> '<b>test/java</b>') marked properly for IDE in 
project/module structure.

<u>Generated tests depends on next classes:</u>
<ul>
<li><b>org.junit.jupiter.api.Assertions</b></li>
<li><b>org.junit.jupiter.api.Test</b></li>
<li><b>org.mockito.Mockito</b> - if tests use mocks only</li>
</ul>
So, you are free to choose libraries that contain these classes.

Enjoy experiments with <b>Didro</b>!
