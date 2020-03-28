lein-modules doesn't work with Leiningen 2.9.3
# how to reproduce
```
$ git clone git@github.com:saitouena/lein-modules-doesnt-work-with-lein-2-9-3.git
$ cd lein-modules-doesnt-work-with-lein-2-9-3/
$ lein upgrade 2.9.3
$ lein modules install
 Module build order:
   a
   b
------------------------------------------------------------------------
 Building a 0.1.0-SNAPSHOT (base,system,user,provided,dev)
------------------------------------------------------------------------
WARNING: You have $CLASSPATH set, probably by accident.
It is strongly recommended to unset this before proceeding.
Created /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/a/target/a-0.1.0-SNAPSHOT.jar
Wrote /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/a/pom.xml
Installed jar and pom into local repo.
------------------------------------------------------------------------
 Building b 0.1.0-SNAPSHOT (base,system,user,provided,dev)
------------------------------------------------------------------------
WARNING: You have $CLASSPATH set, probably by accident.
It is strongly recommended to unset this before proceeding.
Error encountered performing task 'install' with profile(s): 'base,system,user,provided,dev'
java.lang.IllegalArgumentException: Bad artifact coordinates a:a:jar::version, expected format is <groupId>:<artifactId>[:<extension>[:<classifier>]]:<version>
        at org.eclipse.aether.artifact.DefaultArtifact.<init>(DefaultArtifact.java:77)
        at org.eclipse.aether.artifact.DefaultArtifact.<init>(DefaultArtifact.java:60)
        at cemerick.pomegranate.aether$artifact.invokeStatic(aether.clj:244)
        at cemerick.pomegranate.aether$artifact.invoke(aether.clj:242)
        at cemerick.pomegranate.aether$dependency.invokeStatic(aether.clj:253)
        at cemerick.pomegranate.aether$dependency.invoke(aether.clj:246)
        at cemerick.pomegranate.aether$coords__GT_Dependencies$fn__364.invoke(aether.clj:704)
        at clojure.core$map$fn__5851.invoke(core.clj:2753)
        at clojure.lang.LazySeq.sval(LazySeq.java:42)
        at clojure.lang.LazySeq.seq(LazySeq.java:51)
        at clojure.lang.RT.seq(RT.java:531)
        at clojure.lang.LazilyPersistentVector.create(LazilyPersistentVector.java:44)
        at clojure.core$vec.invokeStatic(core.clj:377)
        at clojure.core$vec.invoke(core.clj:367)
        at cemerick.pomegranate.aether$coords__GT_Dependencies.invokeStatic(aether.clj:697)
        at cemerick.pomegranate.aether$coords__GT_Dependencies.invoke(aether.clj:694)
        at cemerick.pomegranate.aether$resolve_dependencies_STAR_.invokeStatic(aether.clj:794)
        at cemerick.pomegranate.aether$resolve_dependencies_STAR_.doInvoke(aether.clj:707)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.core$apply.invokeStatic(core.clj:665)
        at clojure.core$apply.invoke(core.clj:660)
        at cemerick.pomegranate.aether$resolve_dependencies.invokeStatic(aether.clj:815)
        at cemerick.pomegranate.aether$resolve_dependencies.doInvoke(aether.clj:809)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.core$apply.invokeStatic(core.clj:665)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.classpath$get_dependencies_STAR_.invokeStatic(classpath.clj:289)
        at leiningen.core.classpath$get_dependencies_STAR_.invoke(classpath.clj:282)
        at clojure.lang.AFn.applyToHelper(AFn.java:165)
        at clojure.lang.AFn.applyTo(AFn.java:144)
        at clojure.core$apply.invokeStatic(core.clj:665)
        at clojure.core$memoize$fn__6862.doInvoke(core.clj:6353)
        at clojure.lang.RestFn.invoke(RestFn.java:457)
        at leiningen.core.classpath$get_dependencies$fn__6864.invoke(classpath.clj:338)
        at leiningen.core.classpath$get_dependencies.invokeStatic(classpath.clj:336)
        at leiningen.core.classpath$get_dependencies.doInvoke(classpath.clj:330)
        at clojure.lang.RestFn.invoke(RestFn.java:445)
        at clojure.lang.AFn.applyToHelper(AFn.java:160)
        at clojure.lang.RestFn.applyTo(RestFn.java:132)
        at clojure.core$apply.invokeStatic(core.clj:671)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.classpath$resolve_managed_dependencies.invokeStatic(classpath.clj:449)
        at leiningen.core.classpath$resolve_managed_dependencies.doInvoke(classpath.clj:436)
        at clojure.lang.RestFn.invoke(RestFn.java:445)
        at leiningen.core.eval$prep.invokeStatic(eval.clj:85)
        at leiningen.core.eval$prep.invoke(eval.clj:73)
        at leiningen.jar$build_jar.invokeStatic(jar.clj:287)
        at leiningen.jar$build_jar.invoke(jar.clj:284)
        at leiningen.jar$main_jar.invokeStatic(jar.clj:296)
        at leiningen.jar$main_jar.invoke(jar.clj:292)
        at leiningen.jar$jar.invokeStatic(jar.clj:347)
        at leiningen.jar$jar.invoke(jar.clj:329)
        at leiningen.jar$jar.invokeStatic(jar.clj:349)
        at leiningen.jar$jar.invoke(jar.clj:329)
        at leiningen.install$install.invokeStatic(install.clj:21)
        at leiningen.install$install.invoke(install.clj:12)
        at clojure.lang.AFn.applyToHelper(AFn.java:154)
        at clojure.lang.AFn.applyTo(AFn.java:144)
        at clojure.lang.Var.applyTo(Var.java:705)
        at clojure.core$apply.invokeStatic(core.clj:667)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.main$partial_task$fn__7356.doInvoke(main.clj:284)
        at clojure.lang.RestFn.invoke(RestFn.java:410)
        at clojure.lang.AFn.applyToHelper(AFn.java:154)
        at clojure.lang.RestFn.applyTo(RestFn.java:132)
        at clojure.lang.AFunction$1.doInvoke(AFunction.java:31)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.core$apply.invokeStatic(core.clj:667)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.main$apply_task.invokeStatic(main.clj:334)
        at leiningen.core.main$apply_task.invoke(main.clj:320)
        at leiningen.with_profile$with_profiles_STAR_.invokeStatic(with_profile.clj:14)
        at leiningen.with_profile$with_profiles_STAR_.invoke(with_profile.clj:8)
        at leiningen.with_profile$apply_task_with_profiles.invokeStatic(with_profile.clj:53)
        at leiningen.with_profile$apply_task_with_profiles.invoke(with_profile.clj:45)
        at leiningen.with_profile$with_profile$fn__11285.invoke(with_profile.clj:85)
        at clojure.core$mapv$fn__8430.invoke(core.clj:6912)
        at clojure.core.protocols$fn__8144.invokeStatic(protocols.clj:168)
        at clojure.core.protocols$fn__8144.invoke(protocols.clj:124)
        at clojure.core.protocols$fn__8099$G__8094__8108.invoke(protocols.clj:19)
        at clojure.core.protocols$seq_reduce.invokeStatic(protocols.clj:31)
        at clojure.core.protocols$fn__8131.invokeStatic(protocols.clj:75)
        at clojure.core.protocols$fn__8131.invoke(protocols.clj:75)
        at clojure.core.protocols$fn__8073$G__8068__8086.invoke(protocols.clj:13)
        at clojure.core$reduce.invokeStatic(core.clj:6828)
        at clojure.core$mapv.invokeStatic(core.clj:6903)
        at clojure.core$mapv.invoke(core.clj:6903)
        at leiningen.with_profile$with_profile.invokeStatic(with_profile.clj:85)
        at leiningen.with_profile$with_profile.doInvoke(with_profile.clj:63)
        at clojure.lang.RestFn.invoke(RestFn.java:445)
        at clojure.lang.AFn.applyToHelper(AFn.java:160)
        at clojure.lang.RestFn.applyTo(RestFn.java:132)
        at clojure.lang.Var.applyTo(Var.java:705)
        at clojure.core$apply.invokeStatic(core.clj:667)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.main$partial_task$fn__7356.doInvoke(main.clj:284)
        at clojure.lang.RestFn.applyTo(RestFn.java:139)
        at clojure.lang.AFunction$1.doInvoke(AFunction.java:31)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.core$apply.invokeStatic(core.clj:667)
        at clojure.core$apply.invoke(core.clj:660)
        at leiningen.core.main$apply_task.invokeStatic(main.clj:334)
        at leiningen.core.main$apply_task.invoke(main.clj:320)
        at leiningen.core.main$resolve_and_apply.invokeStatic(main.clj:343)
        at leiningen.core.main$resolve_and_apply.invoke(main.clj:336)
        at leiningen.core.main$_main$fn__7445.invoke(main.clj:453)
        at leiningen.core.main$_main.invokeStatic(main.clj:442)
        at leiningen.core.main$_main.doInvoke(main.clj:439)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.lang.Var.applyTo(Var.java:705)
        at clojure.core$apply.invokeStatic(core.clj:665)
        at clojure.main$main_opt.invokeStatic(main.clj:491)
        at clojure.main$main_opt.invoke(main.clj:487)
        at clojure.main$main.invokeStatic(main.clj:598)
        at clojure.main$main.doInvoke(main.clj:561)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.lang.Var.applyTo(Var.java:705)
        at clojure.main.main(main.java:37)
Subprocess failed
```
succeeds with 2.9.2
```
$ lein upgrade 2.9.2 # downgrade to 2.9.2
$ lein modules install
 Module build order:
   a
   b
------------------------------------------------------------------------
 Building a 0.1.0-SNAPSHOT (base,system,user,provided,dev)
------------------------------------------------------------------------
WARNING: You have $CLASSPATH set, probably by accident.
It is strongly recommended to unset this before proceeding.
Created /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/a/target/a-0.1.0-SNAPSHOT.jar
Wrote /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/a/pom.xml
Installed jar and pom into local repo.
------------------------------------------------------------------------
 Building b 0.1.0-SNAPSHOT (base,system,user,provided,dev)
------------------------------------------------------------------------
WARNING: You have $CLASSPATH set, probably by accident.
It is strongly recommended to unset this before proceeding.
Created /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/b/target/b-0.1.0-SNAPSHOT.jar
Wrote /home/t/sand/unko/lein-modules-doesnt-work-with-lein-2-9-3/b/pom.xml
Installed jar and pom into local repo.
```
