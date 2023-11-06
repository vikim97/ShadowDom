# How To Use
Scenario: Navigate to https://www.ti.com/, click on **Ship to**, search for **Vietnam**.

I inspect the **Ship to** element to detect its locator from the HTML DOM:
<img width="1401" alt="31d0027d-6552-4cfd-97aa-5fcfb61e5abb" src="https://github.com/vikim97/ShadowDom/assets/85481702/41ea624e-8d56-4a42-8da9-5190fb7e27d0">

Right-click on the `class="header-llc-sidesheet-preview"` that stands for the **Ship to** element > **Copy** > **Copy JS path**.
<img width="708" alt="68717ed9-36eb-4965-9454-bbaae61f03d0" src="https://github.com/vikim97/ShadowDom/assets/85481702/33b2288b-3015-4e15-9bcd-248b4dc0b013">

Open Katalon Studio, and insert the custom keyword `web.ShadowDom.clickDomElement`
Double-click on the **Input** column and paste the JS path > OK.
<img width="721" alt="8abcaa9d-8777-4b92-98dd-72b699fc6a1d" src="https://github.com/vikim97/ShadowDom/assets/85481702/016e94e7-fda1-481c-9cca-3efd84b96254">

Next, we do the same with the set text step, I inspect the **Search** field, right-click on the element > **Copy** > **Copy JS path**.
<img width="1262" alt="51447a01-029c-4c56-8547-6adadc43d300" src="https://github.com/vikim97/ShadowDom/assets/85481702/aa4d726c-9a75-49e2-a676-3f6ccf7abcd6">

I insert the keyword `web.ShadowDom.setTextDomElement`.
Double-click on the Input column, paste the JS path in the **script** param and **Vietnam** in the text param.
<img width="742" alt="e8fc05b0-fdcb-48a3-9714-e33e85f22aae" src="https://github.com/vikim97/ShadowDom/assets/85481702/bbc741a2-86fe-4712-b5c7-1272c3db5aaa">

Just run the test and observe the result.
<img width="559" alt="3db4c36c-1364-4356-bb38-8c003dd53539" src="https://github.com/vikim97/ShadowDom/assets/85481702/44fe782c-afaf-4ffb-b91e-d45e038d4a5e">

## Demo video: 
https://drive.google.com/file/d/19TVM4lBD9pFphx76rJ_ngg-hXVt38SlU/view?usp=sharing
