责任链模式： 见chainhandler包
主要使用来处理 请求传递的过程。
比如：ConcreteHandler1 中 有一个处理方法，如果处理不了，就把请求传给整个
责任链上，它的下一位。（这里使用的方法是，把它的下一位在它这里注册了）

而FilterChain包中，是责任链的一种，和javaweb中的doFilter的一种可能实现的方式。
主要是把整个责任链，存放在FiletChain链中，而不是依靠 责任链中对象的注册来实现顺序，
统一的把他们按顺序放在 ArrayList中，然后依次调用doFilter。当然这里并没有实现，跳出
FilterChain的方式。而是必须执行完整个Filter。