Subject 抽象的被观察者
Observer 抽象的观察者
WeathData 具体的被观察者
StatisticDisplay 具体的观察者

观察者模式，主要应用这样一种场景：

你做事的时候，总有一堆人盯着你，那一堆人必须去你那里注册，这样你做了感兴趣的事情就可以通知它了
被观察者被很多观察者观察，   被观察者有一个列表装注册的观察者，    当被观察者执行某个业务之后通知注册的观察者

拉拉