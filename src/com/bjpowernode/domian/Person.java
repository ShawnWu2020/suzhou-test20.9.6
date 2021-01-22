package com.bjpowernode.domian;

/**
 * @author Beck
 * @date 2020/9/6 0006  14:24
 */
public class Person {
//都是push :当异行冲突时提交会自动合并，但是同行冲突则需要merge或者在提示冲突时cancel后再pull去手动修改再add-commit-push。
//当改了后 pull,则会提示有冲突不可提交，要么按照提示，将冲突部分修改和上一版本一样，再pull。要么直接commit--再push,然后调整冲突
    private String id;
    private String name;
    private String address;
    private String email;
    private String test1;
    private String test8;
    private String test3;
    private String test4;
    private String test51;
    private String test52;

    private String test6;

    private String test5;

    private String test7;
    private String test71;
    private String test72;

}
