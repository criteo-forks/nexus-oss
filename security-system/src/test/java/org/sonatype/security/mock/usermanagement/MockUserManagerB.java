package org.sonatype.security.mock.usermanagement;

import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.security.authorization.Role;
import org.sonatype.security.usermanagement.DefaultUser;
import org.sonatype.security.usermanagement.RoleIdentifier;
import org.sonatype.security.usermanagement.UserManager;

@Component( role = UserManager.class, hint = "MockUserManagerB" )
public class MockUserManagerB
    extends AbstractMockUserManager

{
    public MockUserManagerB()
    {

        DefaultUser a = new DefaultUser();
        a.setName( "Brenda D. Burton" );
        a.setEmailAddress( "bburton@sonatype.org" );
        a.setSource( this.getSource() );
        a.setUserId( "bburton" );
        a.addRole( new RoleIdentifier( this.getSource(), "RoleA" ) );
        a.addRole( new RoleIdentifier( this.getSource(), "RoleB" ) );
        a.addRole( new RoleIdentifier( this.getSource(), "RoleC" ) );

        DefaultUser b = new DefaultUser();
        b.setName( "Julian R. Blevins" );
        b.setEmailAddress( "jblevins@sonatype.org" );
        b.setSource( this.getSource() );
        b.setUserId( "jblevins" );
        b.addRole( new RoleIdentifier( this.getSource(), "RoleA" ) );
        b.addRole( new RoleIdentifier( this.getSource(), "RoleB" ) );

        DefaultUser c = new DefaultUser();
        c.setName( "Kathryn J. Simmons" );
        c.setEmailAddress( "ksimmons@sonatype.org" );
        c.setSource( this.getSource() );
        c.setUserId( "ksimmons" );
        c.addRole( new RoleIdentifier( this.getSource(), "RoleA" ) );
        c.addRole( new RoleIdentifier( this.getSource(), "RoleB" ) );

        DefaultUser d = new DefaultUser();
        d.setName( "Florence T. Dahmen" );
        d.setEmailAddress( "fdahmen@sonatype.org" );
        d.setSource( this.getSource() );
        d.setUserId( "fdahmen" );
        d.addRole( new RoleIdentifier( this.getSource(), "RoleA" ) );
        d.addRole( new RoleIdentifier( this.getSource(), "RoleB" ) );

        DefaultUser e = new DefaultUser();
        e.setName( "Jill  Codar" );
        e.setEmailAddress( "jcodar@sonatype.org" );
        e.setSource( this.getSource() );
        e.setUserId( "jcodar" );

        DefaultUser f = new DefaultUser();
        f.setName( "Joe Coder" );
        f.setEmailAddress( "jcoder@sonatype.org" );
        f.setSource( this.getSource() );
        f.setUserId( "jcoder" );
        f.addRole( new RoleIdentifier( this.getSource(), "Role1" ) );
        f.addRole( new RoleIdentifier( this.getSource(), "Role2" ) );
        f.addRole( new RoleIdentifier( this.getSource(), "Role3" ) );

        this.addUser( a, a.getUserId() );
        this.addUser( b, b.getUserId() );
        this.addUser( c, c.getUserId() );
        this.addUser( d, d.getUserId() );
        this.addUser( e, e.getUserId() );
        this.addUser( f, f.getUserId() );
    }

    public String getSource()
    {
        return "MockUserManagerB";
    }

}
