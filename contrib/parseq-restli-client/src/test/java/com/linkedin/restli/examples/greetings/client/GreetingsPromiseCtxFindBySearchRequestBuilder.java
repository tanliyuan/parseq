
package com.linkedin.restli.examples.greetings.client;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.FindRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.greetings.api.Greeting;
import com.linkedin.restli.examples.greetings.api.Tone;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:23 PDT 2016")
public class GreetingsPromiseCtxFindBySearchRequestBuilder
    extends FindRequestBuilderBase<Long, Greeting, GreetingsPromiseCtxFindBySearchRequestBuilder>
{


    public GreetingsPromiseCtxFindBySearchRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Greeting.class, resourceSpec, requestOptions);
        super.name("search");
    }

    public GreetingsPromiseCtxFindBySearchRequestBuilder toneParam(Tone value) {
        super.setParam("tone", value, Tone.class);
        return this;
    }

}
