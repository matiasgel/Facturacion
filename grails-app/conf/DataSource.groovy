
dataSource {
    pooled = true
    driverClassName = "org.apache.derby.jdbc.EmbeddedDriver"
    username = "app"
    password = "app"
   dialect = 'org.hibernate.dialect.DerbyDialect'
}
hibernate {
   dialect = 'org.hibernate.dialect.DerbyDialect'
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings

environments {
    development {
        dataSource {
        url = "jdbc:derby:"+System.properties['base.dir']+"/db"
        dbCreate = "validate" // one of 'create', 'create-drop', 'update', 'validate', ''
        
        }
    }
    test {
        dataSource {
            dbCreate = "validate"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE"
        }
    }
    production {
        dataSource {
            dbCreate = "validate"
            url = "jdbc:h2:prodDb;MVCC=TRUE"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
