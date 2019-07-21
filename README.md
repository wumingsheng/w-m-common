# maven中央仓库账号

* username: woms
* password: 10880613 


# settings.xml

```xml

<servers>
    <server>
      <id>sonatype-nexus-snapshots</id>
      <username>woms</username>
      <password>19880613</password>
    </server>
    <server>
      <id>sonatype-nexus-staging</id>
      <username>woms</username>
      <password>19880613</password>
    </server>
</servers>

```

# gpg

- gpg --gen-key
- gpg --list-keys

# deploy

mvn clean deploy -P sonatype-oss-release -Dgpg.passphrase=AE61C8EF3E231F8816BB8904E6230AA6C3EF03BD










